import java.util.*;
public class Main {

	public static int investigate(String goal, String old){
		for(int m = 0; m < old.length(); m++){//何文字目を探しているのか
			int cnt = 0;
			if(goal.charAt(0) == old.charAt(m)){//1文字目発見
				for(int k = 1; m + k < old.length(); k++){//どのくらいの間隔で検索するか
					int dis = m + k;
					for(int p = 1; p < goal.length() && dis < old.length(); p++){//作りたい文字の何文字目を探すか
						if(goal.charAt(p) == old.charAt(dis)){
							cnt++;
							dis += k;
							if(cnt == goal.length() - 1){
								return 1;
							}
						}
						else{
							cnt--;
							break;
						}
					}
					cnt = 0;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String goal = in.next();
		String [] old = new String[N];
		for(int i = 0; i < N; i++){
			old[i] = in.next();
		}
		int ans = 0;
		for(int i = 0; i < N; i++){//どの看板をみているか
			ans += investigate(goal, old[i]);
		}
		System.out.println(ans);
	}
}