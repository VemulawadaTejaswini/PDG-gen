import java.util.Scanner;

class Main{
    public static void main(String[] args){
	int i;
	int j;
	int v;
	int flag = 1;
	int count = 0;
	
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int A[] = new int[n];

	//Initialize data
	for(i=0 ; i<A.length ; i++){
	    int num = scan.nextInt();
	    A[i] = num;
	}
	
	while( flag==1 ){
	    flag = 0;
	    for(j=n-1 ; j>0 ; j--){
		if(A[j] < A[j-1]){
		    v = A[j];
		    A[j] = A[j-1];
		    A[j-1] = v;
		    count++;
		    flag = 1;
		}
	    }
	}
	
	for(i=0 ; i<A.length-1 ; i++){
	    System.out.print(A[i]+" ");
	    }
	System.out.println(A[i]);
	System.out.println(count);
    }
    
}

