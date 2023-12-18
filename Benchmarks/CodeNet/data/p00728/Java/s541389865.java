import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int[] s=new int[n];
int sum=0;
for(int i=0;i<n;i++){
s[i]=sc.nextInt();
sum+=s[i];
}
Arrays.sort(s);
sum-=(s[0]+s[n-1]);
System.out.println(sum/(n-2));
}
}
