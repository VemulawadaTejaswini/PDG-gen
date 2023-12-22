import java.util.Scanner;
public class Main{
    public static void main(String[] args){  
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            String cal = sc.next();
            int y = sc.nextInt();
        
            if(cal.equals("+")){
                System.out.printf("%d\n",x+y);
            }else if(cal.equals("-")){
                System.out.printf("%d\n",x-y);
            }else if(cal.equals("*")){
                System.out.printf("%d\n",x*y);
            }else if(cal.equals("/")){
                System.out.printf("%d\n",x/y);
            }else{
                break;
            }
        }
    }
}
