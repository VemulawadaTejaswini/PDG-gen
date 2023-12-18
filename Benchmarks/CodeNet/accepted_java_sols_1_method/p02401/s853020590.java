import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            int n1 = sc.nextInt();
            String op = sc.next();
            int n2 = sc.nextInt();
            if("+".equals(op)){
                System.out.println(n1+n2);
            }else if("-".equals(op)){
                System.out.println(n1-n2);
            }else if("/".equals(op)){
                System.out.println(n1/n2);
            }else if("*".equals(op)){
                System.out.println(n1*n2);
            }else {
                break;
            }
        }
    }
}

