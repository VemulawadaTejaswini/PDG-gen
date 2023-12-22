import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
     
        //sec--1
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        
        //sec--2
        for(int i=0; i<5; i++) {
          x[i] = sc.nextInt();
          
          //配列子が0を見つける
          if(x[i] == 0) {  
            System.out.println(i+1);
            break;
          }
        }
   }
}