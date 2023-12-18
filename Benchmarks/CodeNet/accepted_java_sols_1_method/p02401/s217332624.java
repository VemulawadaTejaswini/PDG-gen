import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String op;
        String plus="+";
        String minus="-";
        String mul="*";
        String div="/";
        String que="?";
        int answer=0;

        while(true){
            a=sc.nextInt();
            op=sc.next();
            b=sc.nextInt();

            if(op.equals(plus)){
                answer = a+b;
            }
            if(op.equals(minus)){
                answer = a-b;
            }
            if(op.equals(mul)){
                answer = a*b;
            }
            if(op.equals(div)){
                answer = a/b;
            }
            if(op.equals(que)){
                break;
            }
            System.out.println(answer);
        }

        sc.close();
    }
}
