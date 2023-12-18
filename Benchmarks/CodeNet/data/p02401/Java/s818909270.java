import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();
            char c = op.charAt(0);
            if(c=='+'||c=='-'||c=='*'||c=='/'||c=='?'){
                if(c=='+'){
                    System.out.println(a+b);
                }else if(c=='-'){
                    System.out.println(a-b);
                }else if(c=='*'){
                    System.out.println(a*b);
                }else if(c=='/'){
                    if(b==0){
                        break;
                    }else{
                        System.out.println(a/b);
                    }
                }else if(c=='?'){
                    break;
                }
            }else{
                break;
            }
        }
    }
}

