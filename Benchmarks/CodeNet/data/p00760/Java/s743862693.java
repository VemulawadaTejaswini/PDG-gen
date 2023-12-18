import java.util.*;
import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		int n=sc.nextInt();
		TCase:while(n--!=0){
			int y=sc.nextInt(),m=sc.nextInt(),d=sc.nextInt();
			int res=0;
			//y年部分
			res+=(y-1)/3*10*20;
			res+=((y-1)-(y-1)/3)*(5*19+5*20);

			//m月部分
			if(y%3==0){
				res+=(m-1)*20;
			}else{
				res+=(m-1)/2*19+((m-1)-(m-1)/2)*20;
			}

			//日部分
			res+=(d-1);

			ln(196470-res);
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