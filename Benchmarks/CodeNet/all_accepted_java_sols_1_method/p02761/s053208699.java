import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//
//public class atcoder0221_C{
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[] num = new int[N];
		for(int i =0;i<N;i++) {
			num[i]=-1;
		}
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int result = 0;
		for(int i=0;i<M;i++) {
			int S = scan.nextInt();
			int C = scan.nextInt();
			if(map.get(S)==null){
				map.put(S, C);
			}else if(map.get(S)==C){
            }else{
				result =-1;
			}
		}

		if(result!=-1) {     
			Object[] mapkey = map.keySet().toArray();
			Arrays.sort(mapkey);

			for (Integer nKey : map.keySet())
			{
				num[nKey-1]=map.get(nKey);
			}
			if(num[0]==0&&N>1) {
				result = -1;
			}else {
				int count = 1;
				int j = 1;
				for(int i =1;i<N;i++) {
					j = j*10;
				}
				for(int i:num) {
					if(N==1&&count==1&&i==-1){
						i=0;
					}else if(N>1&&count==1&&i==-1){
						i=1;
					}else if(count!=1&&i==-1){
						i=0;
					}
					result=result+(i*j);
					j=j/10;
                  count++;
				}
			}
		}
		System.out.println(result);
	}
}