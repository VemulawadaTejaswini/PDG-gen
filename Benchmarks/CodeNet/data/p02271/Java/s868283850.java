import java.util.Scanner;

class Main{
    public static int n;
    
    public static void main(String[] args){
	int i;
	Scanner scan = new Scanner(System.in);
	n = scan.nextInt();
	int A[] = new int[n];
	for(i=0 ; i<n ; i++){
	    A[i] = scan.nextInt(); 
	}

	int j;
	int q = scan.nextInt();
	int S[] = new int[q];
	for(i=0 ; i<q ; i++){
	    S[i] = scan.nextInt();
	}

	for(i=0 ; i<q ; i++){
	    if( solve(0, S[i], A)==true )System.out.println("yes");
	    else System.out.println("no");
	}	
    }
    
    public static boolean solve(int i, int m, int A[]){
	boolean res;
	if(m == 0)return true;
	if(i >= n)return false;
	res = solve(i + 1, m, A) || solve(i + 1, m - A[i], A);
	return res;
    }
    
}


