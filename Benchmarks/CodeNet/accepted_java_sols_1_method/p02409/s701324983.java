import java.util.Scanner;

public class Main {
 static Scanner scan = new  Scanner(System.in);
    public static void main(String[] args) {
         
           
        int x = scan.nextInt();
        int [][][] arrBuilding = new int[4][3][10];
        int b,n,r,v ;
        
        for (int i = 0; i < x; i++) {
            b = scan.nextInt(); n=scan.nextInt(); r = scan.nextInt(); v = scan.nextInt();
           arrBuilding[b-1][n-1][r-1] += v;
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(" "+ arrBuilding[i][j][k]);
                }
                System.out.println();
            }
            if (i < 3) {
                System.out.println("####################");
            }

        }
     
        }
    }
    
    

