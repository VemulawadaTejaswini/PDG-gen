import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int Pi[]=new int[M];
		int Yi[]=new int[M];
		int count[]=new int[N];
		Map<Integer,Integer> map =new TreeMap<>();	
		for(int i=0;i<M;i++){
			Pi[i]=sc.nextInt();
			Yi[i]=sc.nextInt();
			map.put(Yi[i], i);
		}
		int num;
		int index=0;
		for (Integer value : map.values()) { 
			index=value;
			num=Pi[index]-1;
			if(count[num]==0) {				
				count[num]=1;
				Yi[index]=count[num];
			}else {
				count[num]++;
				Yi[index]=count[num];
			}
		}
		for(int i=0;i<M;i++) {
			System.out.println(String.format("%06d%06d",Pi[i],Yi[i]));
		}
		sc.close();
	}
}