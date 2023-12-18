import java.util.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,k;
		n = sc.nextInt();
		k = sc.nextInt();
		int data[] = new int[n];
		int set[] = new int[n];
		for(int i=0; i<n; ++i) set[i]=0;
		for(int i=0; i<k; ++i) set[sc.nextInt()-1]=sc.nextInt();

		BigInteger big_cnt = new BigInteger("0");
		BigInteger ans_cnt = new BigInteger("0");
		BigInteger end = new BigInteger("1");
		BigInteger _3 = new BigInteger("3");
		BigInteger _1 = new BigInteger("1");
		BigInteger temp_cnt;
		for(int i=0; i<n; ++i){
			end=end.multiply(_3);
		}
		int t_cnt=0, c_cnt=0, b_cnt=0;
		while(true){
			for(int i=0; i<n; ++i) data[i]=set[i];
			temp_cnt = big_cnt;
			t_cnt = c_cnt = b_cnt = 0;
			boolean cnt_flg=true;
			for(int i=0; i<n; ++i){
				switch(temp_cnt.remainder(_3).intValue()){
				case 0:
					if(data[i]==0 || data[i]==1){
						data[i]=1;
						++t_cnt;
						c_cnt=0;
						b_cnt=0;
					}else cnt_flg=false;
					break;
				case 1:
					if(data[i]==0 || data[i]==2){
						data[i]=2;
						t_cnt=0;
						++c_cnt;
						b_cnt=0;
					}else cnt_flg=false;
					break;
				case 2:
					if(data[i]==0 || data[i]==3){
						data[i]=3;
						t_cnt=0;
						c_cnt=0;
						++b_cnt;
					}else cnt_flg=false;
				}
				temp_cnt=temp_cnt.divide(_3);
				if(t_cnt>=3 || c_cnt>=3 || b_cnt>=3 ) cnt_flg=false;
				if(!cnt_flg) break;
			}
			if(cnt_flg) ans_cnt=ans_cnt.add(_1);
			if(big_cnt.compareTo(end)>=0) break;
			big_cnt=big_cnt.add(_1);
		}
		BigInteger _10000 = new BigInteger("10000");
		System.out.println(ans_cnt.remainder(_10000).intValue());
	}
}