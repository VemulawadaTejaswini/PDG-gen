import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int p=0;
      for(int i=0;i<N;i++){
           int s=scan.nextInt();
          if ((i+1)%2==1&&s%2==1){p++;}
      }

System.out.println(p);
    }
}
