import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true){
            int a=in.nextInt();
        char ch=in.next().charAt(0);
        int b=in.nextInt();
        if(ch=='+'){
            System.out.println((a+b));
        }
        else if(ch=='-'){
            System.out.println((a-b));
        }
        else if(ch=='*'){
            System.out.println((a*b));
        }
        else if(ch=='/'){
            System.out.println((a/b));
        }
        else{
            break;
        }
        
        }
        
    }
}
