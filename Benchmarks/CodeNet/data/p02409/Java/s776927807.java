import java.util.Scanner;


public class Main { 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int [] [] Arr = new int [12] [10] ;
       int n = sc.nextInt();
       for(int k = 0; k<n; k++){
           int b = sc.nextInt();
           int f = sc.nextInt();
           int r = sc.nextInt();
           int B = (b-1) * 3+ f;
           Arr [B-1] [r-1] += sc.nextInt();
       }
       for(int j = 0; j<12; j++){
           for(int i = 0; i<10; i++){
            System.out.print(" "+Arr[j][i]);
           
           }
           if( j == 2||j == 5|| j == 8){
            System.out.print("\n####################");
            }
             System.out.println();  
        }
    }
}


