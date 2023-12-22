import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      int l = Integer.parseInt(sc.next());
      int[] taste = new int[n];
      int sum = 0;
      for(int i=0;i<n;i++){
        taste[i] = l+i;
        sum+=taste[i];
      }
      int idx = -1;
      int min = 10000000;
      for(int i=0;i<n;i++){
        if(min > Math.abs(taste[i])){
          idx = i;
          min = Math.abs(taste[i]);
        }
      }
      System.out.print(sum-taste[idx]);
      System.out.flush();
    }
}