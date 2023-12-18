import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
        String s = sc.next();
        char c = s.charAt(0);
        int b = sc.nextInt();
    
        if(c == '+'){
            System.out.println((a+b));
        }else if(c == '-'){
            System.out.println((a-b));
        }else if(c == '*'){
            System.out.println((a*b));
        }else if(c == '/'){
            System.out.println((a/b));
        }else{
            System.exit(0);
        }
        }
        
    }
}
