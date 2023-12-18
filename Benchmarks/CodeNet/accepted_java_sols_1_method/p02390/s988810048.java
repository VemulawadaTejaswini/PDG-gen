import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       int S=scanner.nextInt();
       int s=S%60;
       int M=S/60;
       int m=M%60;
       int h=M/60;
        System.out.println(h+":"+m+":"+s);
        
              
              
       
    }

}