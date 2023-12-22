import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		String[] days={"SUN","MON","TUE","WED","THU","FRI","SAT","SUN","MON","TUE","WED","THU","FRI","SAT"};
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		long ans =-1;
		for(int i = 0;i<days.length;i++){
			if(W.equals(days[i])){
				ans=1;
				for(int k=i+1;k<days.length;k++){
					if("SUN".equals(days[k])){
						break;
					}
					ans++;
				}
			}
			if(ans != -1){
				break;
			}
		}
		System.out.println(ans);

	}


}
