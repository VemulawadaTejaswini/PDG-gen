import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;

			ArrayList<Integer> list = new ArrayList<Integer>();
			long sum = 0;
			for(int i = 0; i < n;i++){
				int in = sc.nextInt();
				list.add(in);
				sum += in;
			}
			if(! isvalid(sum)){
				System.out.println(-1);
				continue;
			}
			int ans = -1;
			for(int count = 0; count <= 10000; count++){
				for(int i = 0; i < list.size(); i++){
					if(list.get(i) == 0){
						list.remove(i);
						i--;
					}
				}
				boolean flg = true;
				for(int i = 0; i < list.size(); i++){
					if(list.get(i) != i + 1){
						flg = false;
						break;
					}
				}
				if(flg){
					ans = count;
					break;
				}
				int now = 0;
				for(int i = 0; i < list.size(); i++){
					list.set(i, list.get(i) -1);
					now++;
				}
				list.add(now);
			}
			System.out.println(ans);
		}
	}

	private boolean isvalid(long num) {
		long num2 = num * 2;
		int temp = (int)Math.sqrt(num2);
		if((long)temp * (temp + 1) == num2){
			return true;
		}
		return false;
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}