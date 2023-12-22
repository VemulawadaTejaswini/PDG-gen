import java.util.Scanner;

class Main{
    public static void main(String[] args){
         Scanner stdIn = new Scanner(System.in);
         int a = stdIn.nextInt();
         int b = stdIn.nextInt();
         int c = stdIn.nextInt();
         
         if(a<=b){
             if(b<=c) System.out.println(a+ " " +b+ " " +c);
             else if(a<=c) System.out.println(a+ " " +c+ " " +b);
             else System.out.println(c+ " " +a+ " " +b);
         }else{ //b<a
             if(c<=b) System.out.println(c+ " " +b+ " " +a);
             else if(c<=a) System.out.println(b+ " " +c+ " " +a);
             else System.out.println(b+ " " +a+ " " +c);
         }
    }
}