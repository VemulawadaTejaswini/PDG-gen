import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int t[] = new int[n+1];
      int x[] = new int[n+1];
      int y[] = new int[n+1];

      t[0]=0;
      x[0]=0;
      y[0]=0;
      
      for(int i=0;i<n;i++){
        t[i+1] = scan.nextInt();
        x[i+1] = scan.nextInt();
        y[i+1] = scan.nextInt();
      }

      boolean can = true;
      for(int i=0;i<n;i++){
        int dt = t[i+1]-t[i];
        int dist = Math.abs(x[i+1]-x[i])+Math.abs(y[i+1]-y[i]);
        if(dt<dist) can = false;
        if(dt%2!=dist%2) can = false;
      }

      String ans = can?"Yes":"No";
      System.out.println(ans);
      
    }
  }
