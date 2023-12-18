import java.util.Scanner;
class Main{
    public static void main(String[]args){
                Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
       	 int i,j,b;
        if(n!=0){
            do{
         		int[][] a=new int[n+1][n+1];
       	 for(i=0;i<n+1;i++){
           	 for(j=0;j<n+1;j++){
                 if(i!=n&&j!=n){
                     b = scan.nextInt();
                     a[i][j]=b;
               		 a[i][n]+=a[i][j];
                 	 a[n][j]+=a[i][j];
                     a[n][n]+=a[i][j];
                 }
                 System.out.printf("%5d",a[i][j]);
                 if(j==n)System.out.println();
       		      }
     		    }
                n = scan.nextInt();
            }
            while(n!=0);
        }
    }
}
