import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str;
        int a, b;
        String op;
        while(true) {
            str = scan.nextLine();
            String[] num = str.split(" ", 0);

            a = Integer.valueOf(num[0]);
            b = Integer.valueOf(num[2]);
            op = num[1];
            if(op.equals("?")){
                break;
            }
            if(op.equals("+")){
                System.out.println(a+b);
            }else if(op.equals("-")){
                System.out.println(a-b);
            }else if(op.equals("*")){
                System.out.println(a*b);
            }else if(op.equals("/")){
                System.out.println(a/b);
            }
        }
        scan.close();
    }
}
