import java.util.Scanner;

public class Main {
    static   Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {
        int a,b,c=0;
        String op;

        while(true){
            a=scan.nextInt(); op=scan.next(); b=scan.nextInt();
            if("?".equals(op)){
                break;
            }
            
            if("+".equals(op)){
                c = a+b;
            }else if("-".equals(op)){
                c = a-b;
            }else if("*".equals(op)){
                c=a*b;
            }else if("/".equals(op)){
                c=a/b;
            }
            System.out.println(c);
        }
    }
}

