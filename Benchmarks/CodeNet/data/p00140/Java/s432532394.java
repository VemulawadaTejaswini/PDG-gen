import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Bus Line
public class Main{

	static class T{
		int p;
		String s;
		public T(int p, String s) {
			this.p = p;
			this.s = s;
		}
	}
	
	public static void main(String[] args) {
		boolean[][] f = new boolean[10][10];
		for(int i=1;i<=4;i++)f[i-1][i]=f[i][i-1]=f[i+1][i]=f[i][i+1]=true;
		for(int i=5;i<=8;i++)f[i][i+1]=true;
		f[9][5]=true;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0){
			int s = sc.nextInt();
			int g = sc.nextInt();
			T v = new T(s, s+"");
			List<T> l = new ArrayList<T>();
			l.add(v);
			boolean[] u = new boolean[10];
			u[s] = true;
			while(!l.isEmpty()){
				List<T> next = new ArrayList<T>();
				for(T w:l){
					if(w.p==g){
						next.clear();
						System.out.println(w.s);
						break;
					}
					for(int j=0;j<10;j++){
						if(f[w.p][j]&&!u[j]){
							u[j]=true;
							T x = new T(j,w.s+" "+j);
							next.add(x);
						}
					}
				}
				l = next;
			}
		}
	}
}