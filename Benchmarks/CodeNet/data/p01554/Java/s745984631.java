import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		int n=sc.nextInt();
		String[] keys=new String[n];
		for(int i=0;i<n;i++){
			keys[i]=sc.next();
		}
		Arrays.sort(keys);

		int m=sc.nextInt();
		boolean locked=true;
		for(int i=0;i<m;i++){
			String key=sc.next();
			int j=Arrays.binarySearch(keys,key);
			if(j>=0){
				ln((locked?"Opened":"Closed")+" by "+key);
				locked=!locked;
			}else{
				ln("Unknown "+key);
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}