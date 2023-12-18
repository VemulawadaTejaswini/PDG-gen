import java.util.Scanner;

class Main {
    public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int R[] = new int[n];
	for(int i = 0;i < n;i++){
	    R[i] = sc.nextInt();		
	}
	int max = 0;
	for(int j = n - 1 ;j >= 0;j--){
	    if(j == n - 1){
		max = R[j] - R[j - 1];
		//System.out.println(max+" = "+"R["+j+"] - R["+(j - 1)+"]");
	    }
	    for(int i = j - 1;i >= 0;i--){		
		if(max < (R[j] - R[i])) max = R[j] - R[i];
	    }
	}
	System.out.println(max);
    }
}














