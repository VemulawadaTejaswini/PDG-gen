
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

     static Scanner scanner;

     public static void main(String[] args) {
         scanner = new Scanner(System.in);

         int N=gi();
         int M=gi();
         int[] a=new int[M];
         int[] b=new int[M];
         boolean[] f=new boolean[N+1];
         Map<Integer, List<Integer>> m=new HashMap<Integer, List<Integer>>();

         for (int i=0; i<M;i++) {
             a[i]=gi();
             b[i]=gi();
             if (m.containsKey(a[i])) {
            	 List<Integer> l=m.get(a[i]);
            	 l.add(b[i]);
             } else {
            	 List<Integer> l=new ArrayList<Integer>();
            	 l.add(b[i]);
            	 m.put(a[i], l);
             }
             if (m.containsKey(b[i])) {
            	 List<Integer> l=m.get(b[i]);
            	 l.add(a[i]);
             } else {
            	 List<Integer> l=new ArrayList<Integer>();
            	 l.add(a[i]);
            	 m.put(b[i], l);
             }
         }

         Queue<Integer> q=new ArrayBlockingQueue<Integer>(N);

         long ans=1;
         for (int i=1; i<=N;i++) {
             if (f[i]==false) {
            	 f[i]=true;
            	 q.add(i);
            	 int tmp=1;
            	 while(!q.isEmpty()) {
            		 int p=q.poll();
            		 List<Integer> l=m.get(p);
            		 if(l==null) continue;
            		 for (int j=0; j<l.size();j++) {
            			 int p2=l.get(j);
            			 if(f[p2]==false) {
            				 f[p2]=true;
            				 q.add(p2);
            				 tmp++;
            			 }
            		 }
            	 }
            	 ans=Math.max(ans, tmp);
             }
         }
         System.out.println(ans);

     }

     public static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> implements Comparable<Pair<K, V>> {
    	    /** serialVersionUID. */
    	    private static final long serialVersionUID = 6411527075103472113L;

    	    public Pair(final K key, final V value) {
    	        super(key, value);
    	    }

    	    @Override
    	    public int compareTo(Pair<K, V> o) {

    	        Comparable key = (Comparable)this.getKey();
    	        Comparable key2 = (Comparable)o.getKey();

    	        return key.compareTo(key2);
    	    }

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