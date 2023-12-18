
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int[] a=new int[N];
         boolean[] b=new boolean[1000001];
         Map<Integer,Integer> m=new HashMap<Integer,Integer>();

         for(int i=0; i<N;i++) {
        	 a[i]=gi();
        	 if(m.containsKey(a[i])) {
        		 m.put(a[i], m.get(a[i])+1);
        	 } else {
        		 m.put(a[i], 1);
        	 }
         }

         Arrays.parallelSort(a);

         int ans=0;
         for(int i=0; i<N;i++) {
             int v=a[i];
             if(m.get(v)==1 && b[v]==false) ans++;
             for(int j=v*2; j<=1000000; j+=v) {
            	 b[j]=true;
             }
             i+=m.get(v)-1;
         }

         System.out.println(ans);
     }

  // 素因数分解
 	public static List<Long> insuB(long n) {
 		List<Long> l=new ArrayList<Long>();
 		long tmp=n;
 		for(long i=2; i<=Math.sqrt(n); i++) {
 			while(tmp%i==0) {
 				tmp=tmp/i;
 				l.add(i);
 			}
 		}
 		if(tmp!=1) l.add(tmp);

 		return l;
 	}

     // 文字列として入力を取得
     public static String gs() {
          return scanner.next();
     }

     // intとして入力を取得
     public static int gi() {
          return Integer.parseInt(scanner.next());
     }

     // longとして入力を取得
     public static long gl() {
          return Long.parseLong(scanner.next());
     }

     // doubleとして入力を取得
     public static double gd() {
          return Double.parseDouble(scanner.next());
     }
}