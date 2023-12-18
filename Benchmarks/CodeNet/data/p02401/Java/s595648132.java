import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,a,b;
        String c="";
        for(i=0; ;i++){
            a=sc.nextInt();
            c=sc.next();
            b=sc.nextInt();
            if(c.equals("+")){
                System.out.println(a+b);
            }else if(c.equals("-")){
                System.out.println(a-b);
            }else if(c.equals("*")){
                System.out.println(a*b);
            }else if(c.equals("/")){
                System.out.println(a/b);
            }else if(c.equals("?")){
                break;
            }        
        }
    }
}
