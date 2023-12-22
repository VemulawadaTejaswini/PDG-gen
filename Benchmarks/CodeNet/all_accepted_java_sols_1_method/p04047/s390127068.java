import java.util.*;
 
public class Main{
 
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int ans = 0;
int[] a = new int[2*n];
for(int i=0;i<2*n;i++) a[i] = s.nextInt();
Arrays.sort(a);
 
for(int i=0;i<2*n;i+=2) ans += Math.min(a[i],a[i+1]);
 
System.out.println(ans);
}
 
}