import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            String k = sc.next();
            int y = sc.nextInt();
            
            if(k.equals("+")){
                System.out.println(x + y);
            }else if(k.equals("-")){
                System.out.println(x - y);
            }else if(k.equals("*")){
                System.out.println(x * y);
            }else if(k.equals("/")){
                System.out.println(x / y);
            }else{
                break;
            }
        }
    }
}
