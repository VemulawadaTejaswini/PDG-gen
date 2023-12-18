
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int N=gi();
        int[] a=new int[N];
        Pair<Integer, Integer>[] p=new Pair[N];

        for(int i=0; i<N; i++) {
        	int x=gi();
        	int y=gi();
        	a[i]=x+y;
        	p[i]=new Pair<Integer,Integer>(x,y);
        }
        Arrays.parallelSort(a);
        long ans = a[N-1]-a[0];
        for(int i=0; i<N; i++) {
        	int k=p[i].getKey();
        	int v=p[i].getValue();
        	if(k+v<=ans)continue;
        	for(int j=0; j<N; j++) {
        		int k2=p[i].getKey();
            	int v2=p[i].getValue();
            	ans=Math.max(ans, Math.abs(k2-k)+Math.abs(v2-v));
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