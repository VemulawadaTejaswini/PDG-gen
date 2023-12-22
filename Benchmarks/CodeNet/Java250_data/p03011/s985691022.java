import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int l = sc.nextInt();
    int max = 0;
    int max1 = 0;

    int y[] = {n,m,l};

    int[] data ={n + m , m + l , n + l };

    for (int i = 0;i < y.length ;i++ ) {
      max1 = Math.max(max1,y[i]);
    }



    System.out.println(n+m+l - max1);


  }
}
