
import java.util.*;
public class Main {
	//2040 start
	//2123 cording end
	//2321 sample matched
	
	int n;
	int [] data, accdata;
	int [] work;
	boolean [] used;
	boolean isNA;
	double ans, length;
	double EPS = 1.0e-08;
	
	private void doit(){
		Scanner sc = new Scanner (System.in);
		int dataset = sc.nextInt();
		while(dataset-- > 0){
			length = sc.nextDouble();
			n = sc.nextInt();
			data = new int[n];
			for(int i = 0 ; i < n;i ++){
				data[i] = sc.nextInt();
			}

			
			work = new int[n];
			used = new boolean[n];
			isNA = false;
			ans = -1.0;
			dfs(0);
			
			if(ans < 0){
				System.out.println(-1);
			}
			else{
				System.out.println(ans);
			}
		}
	}

	private void dfs(int deep) {
		if(deep == n){
			accdata = new int[n + 1];
			for(int i = 0; i < n; i++){
				accdata[i+1] = accdata[i] + work[i];
			}
			HashMap<Double, Double> res = dfs2(0, n-1);
//			System.out.println("work = " + Arrays.toString(work));
//			System.out.println("acc = " + Arrays.toString(accdata));
//			System.out.println();
			for(double d: res.keySet()){
				double value = d + res.get(d);
				if(value > length + EPS){
					continue;
				}
				ans = Math.max(ans, value);
			}
			return;
		}
		
		for(int i = 0; i < n; i++){
			if(! used[i]){
				used[i] = true;
				work[deep] = data[i];
				dfs(deep + 1);
				work[deep] = -1;
				used[i] = false;
			}
		}
	}

	private HashMap<Double, Double> dfs2(int i, int j) {
		HashMap<Double, Double> res = new HashMap<Double,Double>();
		if(i == j){
			res.put(0.0, 0.0);
			return res;
		}
		if(i + 1 == j){
			double right = (double)work[i]/(work[i] + work[j]);
			double left =  (double)work[j]/(work[i] + work[j]);
			res.put(left, right);
			return res;
		}
		
		for(int k = i; k < j; k++){
			HashMap<Double, Double> resleft = dfs2(i, k);
			HashMap<Double, Double> resright = dfs2(k+1, j);
			double nowvalue1 = (double)(accdata[k + 1] - accdata[i]);
			double nowvalue2 = (double)(accdata[j + 1] - accdata[k + 1]);
			for(double leftkey: resleft.keySet()){
				for(double rightkey: resright.keySet()){
					double nowvalueR =  nowvalue1 / (accdata[j + 1] - accdata[i]);
					double nowvalueL =  nowvalue2 / (accdata[j + 1] - accdata[i]);
					double valueright = Math.max(resleft.get(leftkey) - nowvalueL, resright.get(rightkey) + nowvalueR);   
					double valueleft = Math.max(rightkey - nowvalueR, leftkey + nowvalueL);
					res.put(valueleft, valueright);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}