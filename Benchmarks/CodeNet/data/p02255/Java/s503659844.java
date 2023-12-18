import java.util.Scanner;

class Main {
    public static void main(String[] args){
        int i,j,v,k;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A[] = new int[n];

        //Initialize data
        for(i=0; i<n ; i++){
            int num = scan.nextInt();
            A[i] = num;
        }
	for(k=0; k<n-1 ; k++){
	    System.out.print(A[k] + " ");
	}
	System.out.println(A[k]);
        //sort
        for(i = 1 ; i<n ; i++){
            v = A[i];
            j = i-1;
            while(j>=0 && A[j]>v){
                A[j+1] = A[j];
                j--;
            }
	    A[j+1] = v;
	    for(k=0; k<n-1 ; k++){
                System.out.print(A[k] + " ");
            }
	    
            System.out.println(A[k]);
        }
    }
}

