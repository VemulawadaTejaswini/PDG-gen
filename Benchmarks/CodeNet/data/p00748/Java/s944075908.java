import java.util.*;
public class Main {
	static int max = 1000001;
	static int simentai(int n){
		return n*(n+1)*(n+2)/6;
	}
	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		for(int i=0;simentai(i)<max;i++){
			data.add(simentai(i));
			if(data.get(i)>max)break;
		}
		int num[]=new int[max];
		for(int i=0;i<max;i++)num[i]=i;//初期化(四面体が全て1の場合にしておく)
		for(int i=2;i<data.size();i++){//四面体の数だけ進める。
			for(int s=0;s<max;s++){//0からひとつずつ進める。
				if(s-data.get(i)<0)continue;
				int test=num[s-data.get(i)]+1;//四面体数ぶん前に戻ってその通り方+1(今回の)
				num[s]=Math.min(test,num[s]);
			}
		}
		int kisuu[] = new int[max];
		for(int i=0;i<max;i++)kisuu[i]=i;//初期化
		for(int i=2;i<data.size();i++){
			if(data.get(i)%2==0)continue;//偶数ならはじく
			for(int s=0;s<max;s++){
				if(s-data.get(i)<0)continue;
				int test = kisuu[s-data.get(i)]+1;
				if(s==5)System.out.println(kisuu[s]+" or "+test+" "+i);
				kisuu[s]=Math.min(kisuu[s], test);
			}
		}
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			System.out.println(num[n]+" "+kisuu[n]);
		}
	}
}