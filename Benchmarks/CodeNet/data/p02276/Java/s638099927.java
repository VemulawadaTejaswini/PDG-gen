import java.util.Scanner;

public class Main{
	public static int[] partation(int[] A,int p,int r){
		int x=A[r];
		int i=p-1;
		int swap;
		for(int j=p;j<r;j++){
			if(A[j]<=x){
				i=i+1;
				swap=A[i];
				A[i]=A[j];
				A[j]=swap;
			}
		}
		swap=A[i+1];
		A[i+1]=A[r];
		A[r]=swap;
		return A;
	}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i ,n,r;
        n=scan.nextInt();
        int[] A=new int[n];
        for(i=0;i<n;i++){
        	A[i]=scan.nextInt();
        }
        r=A[n-1];
        A=partation(A,0,n-1);
        for(i=0;i<n;i++){
        	if(A[i]==r){
        		System.out.print("["+A[i]+"]");
        	}
        	else{
        		System.out.print(A[i]);
        	}
        	if(i<n-1){
        		System.out.print(" ");
        	}
        	else{
        		System.out.println("");
        	}
        }
        scan.close();
    }
}
