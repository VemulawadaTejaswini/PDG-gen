import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int a1 = 0;
    int a2 = 0;
    int e[] = new int[n+1];
    int w[] = new int[n+1];
    String t = scan.next();

    for (int i=0;i<n;i++){
      if (t.charAt(i) == 'E'){
        a1 += 1;
      }
      else{
        a2 += 1;
      }
      e[i+1] = a1;
      w[i+1] = a2;
    }

    int sum = n;
    for (int j=1;j<=n;j++){
      int check = w[j-1]+e[n]-e[j];
      sum = (int) Math.min(sum,check);
    }
    System.out.println(sum);
  }

}
