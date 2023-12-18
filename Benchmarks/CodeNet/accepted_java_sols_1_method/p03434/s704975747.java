import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int[] a = new int[N];
	int Alice = 0;
	int Bob = 0;
	int diff = 0;
	
	for(int i = 0; i < N; i++){
	    a[i] = scan.nextInt();
	}

	for(int i = 0; i < N-1; i++){
	    for(int j = i+1; j < N; j++){
		if(a[i] < a[j]){
		    int tmp = a[i];
		    a[i] = a[j];
		    a[j] = tmp;
		}
	    }
	}

	for(int i = 0; i < N; i++){
	    if(i % 2 == 0){
		Alice += a[i];
	    }else{
		Bob += a[i];
	    }
	}

	diff = Alice - Bob;

	System.out.println(diff);
    }
}
