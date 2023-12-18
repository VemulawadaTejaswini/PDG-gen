import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int k[] = new int[n];

      for(int i=0;i<n;i++)
      k[i] = scan.nextInt();

      Arrays.sort(k);

      int count = 1;
      for(int i=0;i<n-1;i++){
        if(k[i]<k[i+1])
        count++;
      }
      System.out.println(count);
    }
  }
