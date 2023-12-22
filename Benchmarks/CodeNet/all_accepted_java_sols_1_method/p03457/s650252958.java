import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int x[] = new int[n+1];
       int y[] = new int[n+1];
       int t[] = new int[n+1];
       x[0] = 0;
       y[0] = 0;
       t[0] = 0;
       for(int i = 1; i < n+1; i++){
           t[i] = sc.nextInt();
           x[i] = sc.nextInt();
           y[i] = sc.nextInt();
           if(i > 0){
               int dis = Math.abs(x[i]-x[i-1]) + Math.abs(y[i]-y[i-1]);
               int diff = t[i] - t[i-1];
               if(diff < dis || dis % 2 != diff % 2){
                   System.out.println("No");
                   return;
               }
           }
       }
       System.out.println("Yes");
    }
}

