import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int a, b, c, d;
  int [] x = new int[n];
  int [] y = new int[n];
  int n = sc.nextInt();
  for(int i = 0; i < n*(n-1)/2; i++){
   a = sc.nextInt();
   b = sc.nextInt();
   c = sc.nextInt();
   d = sc.nextInt();
   if(c>d) x[a] += 3;
   else if(c<d) x[b] += 3;
   else{
    x[a] += 1;
    x[b] += 1;
   }
  }
  for(int i = 1; i <= n; i++)
   for(int k = 1; k <= n; k++)
    if(x[i]<x[k]) y[j] ++;
  for(int k = 1; k <= n; k++)
   System.out.println(y[k] + 1);
 }

}