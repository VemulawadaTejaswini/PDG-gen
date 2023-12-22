import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int i;
      for(i=1;i<=A;i++){
        if(Math.floor(i*1.08)==A){
          System.out.println(i);
          return;
        }
      }
        System.out.print(":(");
    }
}