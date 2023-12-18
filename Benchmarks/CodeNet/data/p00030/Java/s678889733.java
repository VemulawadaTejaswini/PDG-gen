import java.util.*;
public class Main {
	static int kazu,kotae;
	static int bfs(int kai,int sum,int num){
		if(sum>kotae||kai>kazu)return 0;
		if(sum==kotae&&kai==kazu)return 1;
		if(num==9)return 0;
		int cnt=0;
		cnt+=bfs(kai+1,sum+num,num+1);
		cnt+=bfs(kai,sum,num+1);
		return cnt;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			kazu=in.nextInt();
			kotae=in.nextInt();
			if(kazu+kotae==0)break;
			int result=bfs(0,0,0);
			System.out.println(result);
		}	
	}
}