import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main{
	//グローバル変数
	static int N;
	static int time;
	static int donetime;
	
	public static void main(String[] args) throws IOException {
		//固定値の読み取り
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		StringTokenizer st=new StringTokenizer(string, " ");
		N=Integer.parseInt(st.nextToken());
		time=Integer.parseInt(st.nextToken());
		String[] name = new String[N];
		int[] times = new int[N];
		
		//nameとtimesの読み取り
		for(int i=0;i<N;i++){
			string=br.readLine();
			st=new StringTokenizer(string, " ");
			name[i]=st.nextToken();
			times[i]=Integer.parseInt(st.nextToken());
		}
		doRound(name,times);	
	}
	
	public static void doRound(String[] name,int[] times){
		while(N>0){
			//the process was finished
			if(times[0]<=time){
				donetime += times[0];
				for(int i=0;i<N-1;i++){
					times[i]=times[i+1];
				}
				System.out.println(name[0]+" "+donetime);
				//nameの入れ替え
				for(int i=0;i<N-1;i++){
					String y = name[i+1];
					name[i]=y;
				}
				N --;
			}else{
				times[0]-=time;
				donetime+=time;
				
				//timeの入れ替え
				int time_zero = times[0];
				for(int i=0;i<N-1;i++){
					int temporary = times[i+1];
					times[i]=temporary;
				}
				times[N-1]=time_zero;
				
				//nameの入れ替え
				String name_zero = name[0];
				for(int i=0;i<N-1;i++){
					String temporary = name[i+1];
					name[i]=temporary;
				}
				name[N-1]=name_zero;
				
			}
		}	
	}
}