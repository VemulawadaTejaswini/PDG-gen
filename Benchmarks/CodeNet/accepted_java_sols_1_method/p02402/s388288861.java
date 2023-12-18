import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int[] a=new int[N];
long sum=0;
for(int i=0;i<N;i++){
    a[i]=Integer.parseInt(sc.next());
        sum+=a[i];
        }
Arrays.sort(a);
System.out.println(a[0]+" "+a[N-1]+" "+sum);
}
}
