import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			Map<Integer, int[]> map = new HashMap<Integer, int[]>();
			for(int i=0;i<n;i++){
				int d = sc.nextInt();
				int t = sc.nextInt();
				if(!map.containsKey(t))map.put(t, new int[600]);
				int[] a = new int[d];
				for(int j=0;j<d;j++)a[j]=sc.nextInt();
				int[] h = map.get(t);
				for(int j=0;j<600;j++)h[j]+=a[j%d];
				map.put(t, h);
			}
			int max = 0;
			for(int t:map.keySet()){
				int[] h = map.get(t);
				for(int s:h)max = Math.max(max, s);
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}