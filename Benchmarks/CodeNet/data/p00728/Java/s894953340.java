import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run() {
		try {
			// ??????????????????????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				List<Integer> perDataGroup = new ArrayList<Integer>();
				int imputNumber = Integer.parseInt(br.readLine());
				if(imputNumber != 0){
					perDataGroup.add(imputNumber);
					continue;
				} else {
					System.out.println(calc(perDataGroup));
					perDataGroup.clear();
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
	private static int calc(List<Integer> perDataGroup){
		int minNum = perDataGroup.stream().min((a,b) -> a.compareTo(b)).get();
		int maxNum = perDataGroup.stream().max((a,b) -> a.compareTo(b)).get();
		int sum = 0;
		int count = 0;
		for(Integer content : perDataGroup) {
			count++;
			sum = sum + content;
		}

		return (sum - (minNum + maxNum))/(count-2);
	}
}