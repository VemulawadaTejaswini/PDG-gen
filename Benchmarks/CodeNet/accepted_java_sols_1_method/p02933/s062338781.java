import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s = scan.next();
            if(s.length() >= 1 && s.length() <= 10){
                if( a >= 3200 && a < 5000){
                    System.out.println(s.toLowerCase());
                }else if(a >= 2800 && a < 3200){
                    System.out.println("red");
            }
        }
    }
}