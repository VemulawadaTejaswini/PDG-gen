import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][][] A= new int[4][3][10]; 
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
         int b=sc.nextInt();
         int f=sc.nextInt();
         int r=sc.nextInt();
         int v=sc.nextInt();
         A[b-1][f-1][r-1]+=v;
        }
         for( int i = 0; i < 4; i++ ) {
        	for( int j = 0; j < 3; j++ ) {
                for( int z = 0; z < 10; z++ ) {
                       System.out.print(" "+A[i][j][z]);
            
                }
                System.out.println();
            }
                for(int x=0;x<20;x++){
                    if(i==3)break;
                    System.out.print("#");
                    
         }
              if(i<3){
              System.out.println();
             
          }
    }
}
}                                           
