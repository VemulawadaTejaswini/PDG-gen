import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int a=scanner.nextInt();
       int b=scanner.nextInt();
       
       for(int i=1;i<=a;i++){
           if(a==0&&b==0){
               break;
               
           }
           for(int j=1;j<=b-1;j++){
               System.out.print("#");
           }
           System.out.println("#");
       }
    }
}