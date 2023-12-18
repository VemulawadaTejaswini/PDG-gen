import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String s = "";
        int b = 0;
        do{
            a = sc.nextInt();
            s = sc.next();
            b = sc.nextInt();

            if(s.equals("+")){
                System.out.println(a + b);
            }
            else if(s.equals("-")){
                System.out.println(a - b);
            }
            else if(s.equals("*")){
                System.out.println(a * b);
            }
            else if(s.equals("/")){
                if(b != 0) System.out.println(a / b);
                else System.out.println();
            }
            else{
                a = 0;
                s = "";
                b = 0;
            }
        }while(!(s.equals("?")));
    }
}
