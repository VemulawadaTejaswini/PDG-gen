import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter(",|\n");

    int w=sc.nextInt();
    int string[] = new int[w];

    for(int i=0; i<w; i++) string[i] = i+1;

    int n=sc.nextInt();
    int a[] = new int [n];
    int b[] = new int [n];
    int times=0;
    int chg=0;

    while(times<n){
      a[times]=sc.nextInt();
      b[times]=sc.nextInt();

      chg=string[(a[times]-1)];
      string[(a[times]-1)]=string[(b[times]-1)];
      string[(b[times]-1)]=chg;

      times++;
    }

    for(int i=0; i<w; i++) System.out.println(string[i]);
  }
}

