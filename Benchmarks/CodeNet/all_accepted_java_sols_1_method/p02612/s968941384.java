import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      for(int i = 1; i <= 10; i++){
        if((n - 1000 * i) <= 0){
          System.out.println((n - 1000 * i) * -1);
          break;
        }
      }
    }

}