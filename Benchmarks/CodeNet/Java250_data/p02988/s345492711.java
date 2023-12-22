import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] p = new int[n];
   for(int i = 0; i<n ; i++){
   p[i] = sc.nextInt();
   }
   int ans = 0;
   for(int k = 0;k<n-2 ; k++){
     if(p[k]>p[k+1] && p[k+2]>p[k+1]) continue;
     else if(p[k]<p[k+1] && p[k+2]<p[k+1]) continue;
     else ans++;
   }
  System.out.println(ans);
 
 }
}