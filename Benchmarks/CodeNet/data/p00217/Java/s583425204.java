import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0217();
	}
	
	class AOJ0217{
		public AOJ0217() {
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				Data data[] = new Data[n];
				for(int i=0;i<n;i++)data[i] = new Data(in.nextInt(), in.nextInt(), in.nextInt());
				Arrays.sort(data);
				System.out.println(data[n-1].ban+" "+data[n-1].sum);
 			}
		}
		class Data implements Comparable<Data>{
			int ban,sum;
			public Data(int ban,int d1,int d2) {
				this.ban = ban;this.sum = d1+d2;
			}
			public int compareTo(Data o) {
				if(this.sum>o.sum)return 1;
				else return -1;
			}
		}
	}
	
}