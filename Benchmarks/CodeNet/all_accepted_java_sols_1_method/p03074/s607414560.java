import java.util.*;
public class Main {
	ArrayList<Integer> t = new ArrayList<Integer>();
	int count;
	String num = "1";
	int sum;
	int max =1;

	Main(int n,int k,String[] S){
		for(int p=0;p<n;p++){
			if(!(S[p].equals(num))){
				if(num.equals("0")){
					num="1";
				}else{
					num="0";
				}
				t.add(count);
				count=0;
			}
			count++;
		}

		t.add(count);			//ラス1回追加
		if(num.equals("0"))t.add(0);	//10並びにしたいので、終端数が1の場合は末尾0が0個扱い
      
		Iterator it = t.iterator();
		count=0;
		while(it.hasNext()&&count<k*2+1){
			sum += (int)(it.next());
			count++;
		}

		max=sum;

		while(count<t.size()){
			sum += t.get(count);
			sum += t.get(count+1);
			sum -= t.get(count-k*2-1);
			sum -= t.get(count-k*2);
			if(sum>max)max=sum;
			count+=2;
		}

		// 出力
		System.out.println(max);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		String s = sc.next();
		String[] S = s.split("");

		new Main(n,k,S);
	}
}