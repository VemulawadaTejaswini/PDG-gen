import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) break;
			Data[] list = new Data[n];
			for(int i = 0; i < n; i++) {
				String l = stdIn.next();
				int p = stdIn.nextInt();
				int ft = 0;
				int rt = 0;
				for(int j = 0; j < 3; j++) {
					ft += stdIn.nextInt();
				}
				for(int j = 0; j < 2; j++) {
					int a = stdIn.nextInt();
					ft += a;
					rt += a;
				}
				
				int f = stdIn.nextInt();
				int s = stdIn.nextInt();
				int m = stdIn.nextInt();
				
				int alltime = ft + rt*(m-1);
				int allmoney = f*s*m - p;
				
				list[i] = new Data(l,(double)allmoney/(double)alltime);
				
				
			}
			Arrays.sort(list,new MyComp());
			
			for(int i = 0; i < n; i++) {
				System.out.println(list[i].name);
			}
			System.out.println("#");
		}
	}
}
class Data {
	public String name;
	public double ef;
	public Data(String name, double ef) {
		this.name = name;
		this.ef = ef;
	}
}

class MyComp implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		if(o1.ef < o2.ef) {
			return 1;
		}
		if(o1.ef > o2.ef) {
			return -1;
		}
		return o1.name.compareTo(o2.name);
	}
	
}