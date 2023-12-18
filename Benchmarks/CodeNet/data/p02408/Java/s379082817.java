import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][] a= new int[4][13];  
        	for( int i = 0; i < n; i++ ) {
                String s=sc.next();
                int r=sc.nextInt();
                if(s.equals("S")){
                    a[0][r-1]=1;
                }
                else if(s.equals("H")){
                    a[1][r-1]=1;
                }
                else if(s.equals("C")){
                    a[2][r-1]=1;
                }
                else{
                    a[3][r-1]=1;
                }
            }
       	 for( int i = 0; i < 4; i++ ) {
        	for( int j = 0; j < 13; j++ ) {
         if(a[i][j]!=1){
         if(i==0){
         	System.out.println("S "+(j+1));
        }else if(i==1){
         	System.out.println("H "+(j+1));
        }else if(i==2){
         	System.out.println("C "+(j+1));
        }else if(i==3){
            System.out.println("D "+(j+1));
         }
              
        }
   	 }
    }
   }
}

