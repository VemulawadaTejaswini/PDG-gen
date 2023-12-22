import java.util.*;

class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();	
			int[] a = new int[n];
			for(int i=0;i<n;i++){
				a[i] = in.nextInt();
			}
			for(int j=0;j<n;j++){
				System.out.print(a[n-j-1]);
				if(j==n-1){
					System.out.println();
				}
				else{
					System.out.print(" ");
				}
			}	
	}
}