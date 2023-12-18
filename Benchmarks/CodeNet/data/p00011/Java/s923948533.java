import java.util.Scanner;

public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int n = sc.nextInt();
    
    int [] p = new int [w];
    int i;

    for(i=0;i<w;i++){
      p[i]=i+1;
    }

    for(i=0;i<n;i++){
      String str = sc.next();
      String[] ab = str.split(",");
      int a = Integer.parseInt(ab[0]) - 1;
      int b = Integer.parseInt(ab[1]) - 1;

      int x;
      x = p[a];
      p[a] = p[b];
      p[b] = x;


    }

    for(i=0;i<w;i++){
      System.out.println(p[i]);
    }
    sc.close();
  }
}
