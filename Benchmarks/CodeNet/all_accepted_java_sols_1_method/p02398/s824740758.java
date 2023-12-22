import java.util.Scanner;
class Main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
       int i = 0;
       
       for(int x = a; x <= b; x++){
         if(c % x == 0) i++;
       }
       
       System.out.println(i);
    }
}