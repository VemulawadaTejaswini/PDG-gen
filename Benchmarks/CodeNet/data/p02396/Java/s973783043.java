import java.util.Scanner;
class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int x;
       for(int i = 0; i < 10000; i++){
         x = scan.nextInt();
         System.out.println("Case " + i + ": " + x);
         if(x == 0) break;
       }
    }
}