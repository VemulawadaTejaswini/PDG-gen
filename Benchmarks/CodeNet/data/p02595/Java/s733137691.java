import java.util.Scanner;


public class Main{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   int d = scanner.nextInt();
   int x[];
   int y[];
   int cnt = 0;
   x = new int[n];
   y = new int[n];
   for(int i=0;i<n;i++){
     x[i] = scanner.nextInt();
     y[i] = scanner.nextInt();
     if(Math.sqrt(x[i]*x[i]+y[i]*y[i])<=d){
          cnt++;
     }else{
     }
   }
  System.out.println(cnt);
  }
}