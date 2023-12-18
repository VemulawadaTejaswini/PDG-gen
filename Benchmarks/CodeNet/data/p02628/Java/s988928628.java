import java.util.*;

public class Main {
 	 static Scanner sc = new Scanner(System.in);
 	 public static void main(String[] args){
       int N = sc.nextInt(); 
       int K = sc.nextInt();
       int p[] = new int[N];
       
       for(int i=0;i<N;i++) {
       		p[i] = sc.nextInt();
       }
       Arrays.sort(p);
       int a=0;
       for(int i=0;i<K;i++) {
       	a += p[i];
       }
       System.out.println(a);
     }
}   