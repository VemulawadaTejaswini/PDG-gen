import java.util.Scanner;

public class Main {

  private int a;

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 0;

        if(N % 2 == 1){
           a = (N / 2) + 1;
        }else{
          a = (N / 2);
        }
        System.out.print(a);
    }
}