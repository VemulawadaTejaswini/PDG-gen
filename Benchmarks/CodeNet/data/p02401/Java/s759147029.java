import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
            
            int a=scan.nextInt();
            String s=scan.next();
            int b=scan.nextInt();
            if(s.equals("?")) break;
            if(s.equals("+")) System.out.println(a+b);
            else if(s.equals("-")) System.out.println(a-b);
            else if(s.equals("*")) System.out.println(a*b);
            else if(s.equals("/")) System.out.println(a/b);
        }
        
    }
}
