import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
		int c=sc.nextInt();
		long[][] a=new long[r+1][c+1];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
				a[i][j]=sc.nextInt();
                a[r][j]+=a[i][j];
                a[i][c]+=a[i][j];  
            }
            a[r][c]+=a[i][c];
        }
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                if(j!=c){
            		System.out.print(a[i][j]+" ");
                }else{
                	System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

