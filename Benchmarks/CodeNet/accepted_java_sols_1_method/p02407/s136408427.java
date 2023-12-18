
import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[]a = new int[n];
for(int i=0; i<n; i++) a[i] =sc.nextInt();
for(int s=n-1; s>=0; s--){
if(s>0) System.out.print(a[s]+" ");
else System.out.println(a[0]);
}
}
}