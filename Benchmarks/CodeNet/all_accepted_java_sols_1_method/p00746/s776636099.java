import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
           int n = sc.nextInt();
           if(n == 0) break;
           int[] x = new int[n];
           int[] y = new int[n];
           x[0] = 0;
           y[0] = 0;
           for(int i = 1; i < n; i++){
               int a = sc.nextInt();
               int b = sc.nextInt();
               //System.out.println(a + " " + b);
               switch(b){
               case 0:
                   x[i] = x[a] - 1;
                   y[i] = y[a];
                   break;
               case 1:
                   x[i] = x[a];
                   y[i] = y[a] - 1;
                   break;
               case 2:
                   x[i] = x[a] + 1;
                   y[i] = y[a];
                   break;
               case 3:
                   x[i] = x[a];
                   y[i] = y[a] + 1;
                   break;
               }
           }
        //   for(int i = 0; i < n; i++){
        //       System.out.println(x[i] + " " + y[i]);
        //   }
           int xmax = -300;
           int ymax = -300;
           int xmin = 300;
           int ymin = 300;
           for(int i = 0; i < n; i++){
               xmax = Math.max(x[i], xmax);
               xmin = Math.min(x[i], xmin);
               ymax = Math.max(y[i], ymax);
               ymin = Math.min(y[i], ymin);
           }
           //System.out.println(xmax + " " + xmin + " " + ymax + " " + ymin);
           int xans = xmax - xmin + 1;
           int yans = ymax - ymin + 1;
           System.out.println(xans + " " + yans);
       }
    }
}

