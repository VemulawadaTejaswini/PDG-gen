import java.util.*;
class Main{
   static boolean solve(int n,int A[],int i,int m){
	if(m == 0)return true;
	if(i >= n)return false;
	return solve(n,A,i+1,m) || solve(n,A,i+1,m-A[i]);
    }
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int num1[] = new int[n];
	for(int i = 0; i< n; i++){
	    num1[i] = sc.nextInt();
	}
	
	int q = sc.nextInt();
	for(int i = 0; i < q; i++){
	    int m = sc.nextInt();
	    int j = 0;
	    if(solve(n,num1,j,m)){
		System.out.println("yes");
	    }
	    else System.out.println("no");
	}
	
    }
}
