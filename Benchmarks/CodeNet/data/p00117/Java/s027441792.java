
import static java.lang.System.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static int INF=1<<28;


    void warshall_floyd(int[][] d){
		final int V=d.length;
	    for(int k=0;k<V;k++)
	    	for(int i=0;i<V;i++)for(int j=0;j<V;j++)
	    		if(d[i][j]>d[i][k] + d[k][j]){
	    			d[i][j]=d[i][k] + d[k][j];
	    		}
	}


    public void run() {
    	int N=sc.nextInt(),M=sc.nextInt();

    	int[][] ds=new int[N][N];
    	for(int i=0;i<N;i++)Arrays.fill(ds[i],INF);
    	for(int i=0;i<N;i++)ds[i][i]=0;

    	Pattern p=Pattern.compile("(\\d*),(\\d*),(\\d*),(\\d*)");

    	for(int i=0;i<M;i++){
    		Matcher m=p.matcher(sc.next().trim());m.find();
    		int f=Integer.parseInt(m.group(1))-1,
    	    	t=Integer.parseInt(m.group(2))-1,
    	    	a=Integer.parseInt(m.group(3)),
        		b=Integer.parseInt(m.group(4));
    		ds[f][t]=a;ds[t][f]=b;
    	}

		Matcher m=p.matcher(sc.next().trim());m.find();
		int f=Integer.parseInt(m.group(1))-1,
    	    	t=Integer.parseInt(m.group(2))-1,
    	    	y1=Integer.parseInt(m.group(3)),
        		y2=Integer.parseInt(m.group(4));

    	warshall_floyd(ds);
		ln(y1-y2-ds[f][t]-ds[t][f]);
    }

    public static Scanner sc = new Scanner(in);
    public static Random rand=new Random();


    public static void main(String[] args) {
        new Main().run();
    }


	//output lib
	static final String br = System.getProperty("line.separator");
	static final String[] asep = new String[] { "", " ", br, br + br };

	static String str(Boolean o) {
		return o ? "YES" : "NO";
	}

	//	static String str(Double o){
	//		return String.format("%.8f",o);
	//	}
	static <K, V> String str(Map<K, V> map) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (Entry<K, V> set : map.entrySet()) {
			if (!isFirst)
				sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst = false;
		}
		return sb.toString();
	}

	static <E> String str(Collection<E> list) {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for (E e : list) {
			if (!isFirst)
				sb.append(" ");
			sb.append(str(e));
			isFirst = false;
		}
		return sb.toString();
	}

	static String str(Object o) {
		int depth = _getArrayDepth(o);
		if (depth > 0)
			return _strArray(o, depth);
		Class<?> c = o.getClass();
		if (c.equals(Boolean.class))
			return str((Boolean) o);
		//if(c.equals(Double.class))return str((Double)o);

		return o.toString();
	}

	static int _getArrayDepth(Object o) {
		if (!o.getClass().isArray() || Array.getLength(o) == 0)
			return 0;
		return 1 + _getArrayDepth(Array.get(o, 0));
	}

	static String _strArray(Object o, int depth) {
		if (depth == 0)
			return str(o);
		StringBuilder sb = new StringBuilder();
		for (int i = 0, len = Array.getLength(o); i < len; i++) {
			if (i != 0)
				sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o, i), depth - 1));
		}
		return sb.toString();
	}

	static void pr(Object... os) {
		boolean isFirst = true;
		for (Object o : os) {
			if (!isFirst)
				out.print(" ");
			out.print(o);
			isFirst = false;
		}
	}

	static void ln() {
		out.println();
	}

	static void ln(Object... os) {
		for (Object o : os) {
			pr(o);
			ln();
		}
	}
}