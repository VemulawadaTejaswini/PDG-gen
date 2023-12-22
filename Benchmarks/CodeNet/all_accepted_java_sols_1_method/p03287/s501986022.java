import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
int m=Integer.parseInt(sc.next());
int[] a=new int[n];
int[] sum=new int[n+1];
sum[0]=0;
for(int i=0;i<n;i++){a[i]=Integer.parseInt(sc.next());sum[i+1]=(sum[i]+a[i])%m;}
HashMap<Integer,Integer> map=new HashMap<>();
for(int i=0;i<=n;i++){map.put(sum[i],0);}
long ans=0;
for(int i=0;i<=n;i++){
int c=map.get(sum[i]);
ans+=c;
c++;
map.put(sum[i],c);
}
System.out.println(ans);
}
}