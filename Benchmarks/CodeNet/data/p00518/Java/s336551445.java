

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int days[][] = new int[N][7];
		char leader[] = new char[N]; 
		int result=0;
		int sub=10007;
		String st = sc.next();
		
		for(int i=0;i<N;i++){//責任者を配列に格納
		leader[i]=st.charAt(i);
		}
		
		//１日目
		if(leader[0]=='J'){//Jが責任者
			days[0][0]=1;
			days[0][3]=1;
			days[0][4]=1;
			days[0][6]=1;
		}
		else if(leader[0]=='O'){//Oが責任者
			days[0][3]=1;
			days[0][6]=1;
		}
		else{//(leader[0]=='I')　Iが責任者
			days[0][4]=1;
			days[0][6]=1;
		}
		//2日目以降
		for(int i=1;i<N;i++){
			if(leader[i]=='J'){
				days[i][0] = (days[i-1][0]+days[i-1][3]+days[i-1][4]+days[i-1][6])%sub;
			}
			if(leader[i]=='O'){
				days[i][1] = (days[i-1][1]+days[i-1][3]+days[i-1][5]+days[i-1][6])%sub;
			}
			if(leader[i]=='I'){
				days[i][2] = (days[i-1][2]+days[i-1][4]+days[i-1][5]+days[i-1][6])%sub;
			}
			if(leader[i]=='J'|| leader[i]=='O'){
				days[i][3] = (days[i-1][0]+days[i-1][1]+days[i-1][3]+days[i-1][4]+days[i-1][5]+days[i-1][6])%sub;
			}
			if(leader[i]=='J'|| leader[i]=='I'){
				days[i][4] = (days[i-1][0]+days[i-1][2]+days[i-1][3]+days[i-1][4]+days[i-1][5]+days[i-1][6])%sub;
			}
			if(leader[i]=='O'|| leader[i]=='I'){
				days[i][5] = (days[i-1][1]+days[i-1][2]+days[i-1][3]+days[i-1][4]+days[i-1][5]+days[i-1][6])%sub;
			}
			if(leader[i]=='J' || leader[i]=='O' || leader[i]=='I'){
				days[i][6]+=(days[i-1][0]+days[i-1][1]+days[i-1][2]+days[i-1][3]+days[i-1][4]+days[i-1][5]+days[i-1][6])%sub;
			}	
		}
		for(int i=0;i<7;i++){//全パターンを足す
			result += days[N-1][i];
		}
		System.out.println(result%sub);
		}
}