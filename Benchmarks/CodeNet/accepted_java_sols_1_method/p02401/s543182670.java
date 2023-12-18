import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,x=0;String s;
        while(true){
            a=sc.nextInt();s=sc.next();b=sc.nextInt();
            switch(s.charAt(0)){
                case '+':x=a+b;break;
                case '-':x=a-b;break;
                case '*':x=a*b;break;
                case '/':x=a/b;break;
                default:System.exit(0);
            }
            System.out.println(x);
        }
    }
}
