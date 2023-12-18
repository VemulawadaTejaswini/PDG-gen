import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,j ,n,r,p=0,x,swap;
        n=scan.nextInt();
        int[] A=new int[n];
        for(i=0;i<n;i++){
        	A[i]=scan.nextInt();
        }
        
        r=n-1;
        x=A[r];
		i=p-1;
		for(j=p;j<r;j++){
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
		
        for(j=0;j<n;j++){
        	if(j==i+1){
        		System.out.print("["+A[j]+"]");
        	}
        	else{
        		System.out.print(A[j]);
        	}
        	if(j<n-1){
        		System.out.print(" ");
        	}
        	else{
        		System.out.println("");
        	}
        }
        scan.close();
    }
}

