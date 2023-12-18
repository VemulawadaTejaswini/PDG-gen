import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	char[][] vals=new char[][]{{},
		{'.',',','!','?',' '},
		{'a','b','c'},
		{'d','e','f'},
		{'g','h','i'},
		{'j','k','l'},
		{'m','n','o'},
		{'p','q','r','s'},
		{'t','u','v'},
		{'w','x','y','z'},
	};

	public void run() {
		char[] keys=sc.next().toCharArray();

		StringBuilder sb=new StringBuilder();

		char now=0;	int times=-1;

		for(int i=0;i<keys.length;i++){
			char key=keys[i];
			if(key=='0'){
				if(Character.isDigit(now)){
					sb.append(vals[now-'0'][times%vals[now-'0'].length]);
				}
				now=0;
				times=-1;
			}else{
				now=key;
				times++;
			}
		}
		ln(sb);
	}
	public static void main(String[] args) {
		int n=sc.nextInt();
		while(n--!=0)
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