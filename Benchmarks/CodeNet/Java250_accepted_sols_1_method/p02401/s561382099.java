import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        while(true){
        int x = input.nextInt();
        String n = input.next();
        int y = input.nextInt();
        if(n.equals("+")){
            System.out.println(x+y);
        }else if(n.equals("-")){
            System.out.println(x-y);
        }else if(n.equals("*")){
            System.out.println(x*y);
        }else if(n.equals("/")){
            System.out.println(x/y);
        }else if(n.equals("?")){
            break;
        }
        }
    }
}