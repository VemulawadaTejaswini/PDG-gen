import java.util.HashSet;
import java.util.Scanner;

public class Main{

	int N;
	String[][] strs;
	HashSet<String> visited, groupName, memberName;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			N = in.nextInt();
			if(N==0) return ;
			strs = new String[N][];
			for(int i=0;i<N; i++){
				String line = in.next();
				strs[i] = line.replace(".","").split("[:,]");
			}
			visited = new  HashSet<String>();
			groupName = new HashSet<String>();
			memberName = new HashSet<String>();
			System.out.println(solve());
		}
	}

	void dfs(String str){
		visited.add(str);
		if(groupName.contains(str)){
			for(int i=0; i<N; i++){
				if(strs[i][0].equals(str)){
					for(int j=1; j<strs[i].length; j++)if(!visited.contains(strs[i][j])){
						dfs(strs[i][j]);
					}
					return ;
				}
			}
		}
		else{
			memberName.add(str);
		}
	}

	int solve(){
		for(int i=0; i<N; i++){
			groupName.add(strs[i][0]);
		}
		dfs(strs[0][0]);
		return memberName.size();
	}

	public static void main(String args[]){
		new Main().run();
	}
}