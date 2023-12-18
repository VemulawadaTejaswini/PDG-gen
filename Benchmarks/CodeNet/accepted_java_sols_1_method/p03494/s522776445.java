import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int count = 0;
	int flag = 0;
	int N = scan.nextInt();
	int[] A = new int[N];
	
	for(int i = 0; i < N; i++){
	    A[i] = scan.nextInt();
	}

	while(true){
	    for(int i = 0; i < N; i++){
		if(A[i] % 2 != 0){
		    flag = 1;
		}
	    }
	    if(flag == 1){
		break;
	    }else{
		for(int i = 0; i < N; i++){
		    A[i] /= 2;
		}
		count++;
	    }
	}

	System.out.println(count);
    }
}
