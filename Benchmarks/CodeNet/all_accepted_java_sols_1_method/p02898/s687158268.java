import java.util.Scanner;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] data = new int[100000];
    int m = 0;

    for(int i = 0;i < n;i++){
      data[i] = sc.nextInt();
    }


    for(int i = 0;i < n;i++){
      if(data[i] >= k){
        m++;
      }
    }

    System.out.println(m);

  }
}