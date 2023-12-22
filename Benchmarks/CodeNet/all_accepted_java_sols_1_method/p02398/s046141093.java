import java.util.Scanner;
public class Main {
 public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
          int j = 0;
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          int c = scanner.nextInt();
          for(int i=a;i<=b;i++){
              int x=c%i;
              if(x==0){
                   j++;
              }
          }      
        System.out.println(j);      
}
}