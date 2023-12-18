import java.util.Scanner;

public class Main{
        public static void main(final String[] args){
            final Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a < b){
                if(c < a){
                    System.out.println(c + " " + a + " " + b);
                }else if(b < c){
                    System.out.println(a + " " + b + " " + c);
                }else {
                    System.out.println(a + " " + c + " " + b);
                }
            }else{
                if(c < b){
                    System.out.println(c + " " + b + " " + a);
                }else if(a < c){
                    System.out.println(b + " " + a + " " + c);
                }else {
                    System.out.println(b + " " + c + " " + a);
                }
            }
            sc.close();
        }


}


