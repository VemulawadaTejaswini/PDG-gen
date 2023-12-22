import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int n = scan.nextInt();
    if (n == 0){
      System.out.println(x);
      return;
    }
    int [] a = new int[103];

    for (int i=0;i<103;i++){
      a[i] = i-1;
    }

    for (int j=0;j<n;j++){
      int t = scan.nextInt();
      a[t+1] = -2;
    }

    if (a[x+1] != -2){
      System.out.println(x);
      return;
    }

    int small = 104;
    int val = -3;
    for (int p=0;p<103;p++){
      if (a[p] == -2){
        continue;
      }
      int abs = x-a[p];
      if (abs == 0){
        System.out.println(x);
        return;
      }

      if (abs < 0){
        abs = -abs;
      }
      if (abs < small){
        small = abs;
        val = a[p];
      }
    }

    System.out.println(val);
  }
}
