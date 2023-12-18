import java.util.*;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
			int n =in.nextInt();
			long m = in.nextInt();
			if(n+m==0)break;
			ArrayList<Data> list = new ArrayList<Data>();
			for(int i=0;i<n;i++)list.add(new Data(in.nextInt(), in.nextInt()));
			Collections.sort(list);
//			for(int i=0;i<n;i++)System.out.println(list.get(i).d+" "+list.get(i).p);
			long all = 0;
			for(int i=0;i<n;i++)all+=(list.get(i).d*list.get(i).p);
//			System.out.println(all);
			int remove = 0;
			int index = 0;
			for(index=0;m>0||index>n;index++){
				if(list.get(index).d<=m){
					int a = list.get(index).d*list.get(index).p;
					remove+=a;
					m-=list.get(index).d;
				}else{
					remove+=list.get(index).p*m;
//					System.out.println(m+" "+remove);
					m=0;
				}
			}
			System.out.println(all-remove);
			
		}
	}
}
class Data implements Comparable<Data>{
	int d,p;
	public Data(int d,int p) {
		this.p = p;
		this.d = d;
	}
	public int compareTo(Data o) {
		if(this.p<o.p)return 1;
		else if(this.p>o.p)return -1;
		return 0;
	}
}