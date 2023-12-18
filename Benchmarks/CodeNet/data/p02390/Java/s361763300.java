import java.util.Scanner;
      public class Main{
             public static void main(String[] args){
                    Scanner stdin = new Scanner(System.in);
                    int S = stdin.nextInt();
                    int h=S/3600,m=(S/60)-(h*60),s=S-(m*60)-(h*3600);
                    System.out.println(h+":"+m+":"+s);
    } 
}
