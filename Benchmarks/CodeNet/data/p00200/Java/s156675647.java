import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 */
	//駅の名前は1から開始!!!
	
	
	
	//線路情報
	public static int[][] value;		//路線の運賃
	public static int[][] time;		//所要時間
	public static int[][] estimate;		//ptr的な
	
	//最短経路
	public static String[][] Best;		//最短経路を記録する必要がある。
	//TotalCost
	public static int[][] TotalCost;		//startからの最短距離
	
	//出発駅
	//public int start_station=-1;		//途中の地点までのコストを探すため。
	
	public static int num_line=0;			//線路数
	public static int max_station=0;		//駅数
	//探索：ダイクストラ法
	public static void main(String[] args)throws Exception{		//途中駅、それまでに掛かったコスト
		//設定値読み込み
		String str;
		String[] split_str;
		BufferedReader input_a =new BufferedReader (new InputStreamReader (System.in));
		int text_line=0;		//テキストの行数
		while((str=input_a.readLine())!=null){
			//System.out.println(str+"@text_line="+text_line);
			split_str=str.split(" ");
			//変数の初期化
			if(text_line==0){
				//1 行目 線路の情報の数 n 駅の数 m (整数 整数;半角空白区切り)
				//変数の初期化
				num_line=Integer.parseInt(split_str[0]);
				max_station=Integer.parseInt(split_str[1]);
				value=new int[max_station][max_station];
				time=new int[max_station][max_station];
				TotalCost=new int[max_station][max_station];
				//Best=new String[max_station][max_station];
				
				//System.out.println("num_line="+num_line+",max_station="+max_station);
			}else if(text_line<=num_line){		//線路情報の取得
				int sub_start=Integer.parseInt(split_str[0])-1;
				int sub_goal=Integer.parseInt(split_str[1])-1;
				int money=Integer.parseInt(split_str[2]);
				int between=Integer.parseInt(split_str[3]);
				
				
				//System.out.println("sub_start="+sub_start+",sub_goal="+sub_goal+",money="+money+",between="+between);
				//運賃、所要時間を記録...駅名は-1した値を利用。
				value[sub_start][sub_goal]=money;
				time[sub_start][sub_goal]=between;
				//逆方法も考慮
				value[sub_goal][sub_start]=money;
				time[sub_goal][sub_start]=between;
			}else if(split_str.length==1){
				//スルー
			}else{
				//...駅名は-1した値を利用。
				int start=Integer.parseInt(split_str[0])-1;
				int goal=Integer.parseInt(split_str[1])-1;
				
				
				if(start==-1&&goal==-1){
					break;
				}
				
				
				int type=Integer.parseInt(split_str[2]);
				//ダイクストラ法
				//System.out.println("探索開始>>"+start+","+goal+","+type);
				int result_cost=search(start,goal,type);
				//System.out.println("最短経路："+result_cost);
				System.out.println(result_cost);
			}
			text_line++;	
		}
	}
	public static int search(int start,int goal,int type){			//type:運賃or時間
		if(type==0){
			estimate=value;
		}else if(type==1){
			estimate=time;
		}		
		
		//TotalCostの初期化:最短距離→MAX
		for(int i=0;i<TotalCost.length;i++){
			for(int j=0;j<TotalCost[i].length;j++){
				if(i==j){		//start->start
					TotalCost[i][j]=Integer.MAX_VALUE;
					//Best[i][j]="";
				}else if(estimate[i][j]!=0){
					TotalCost[i][j]=estimate[i][j];
					//Best[i][j]=i+","+j;
				}else{
					TotalCost[i][j]=Integer.MAX_VALUE;
					//Best[i][j]="";
				}
				//System.out.println("TotalCost["+i+"]["+j+"]="+TotalCost[i][j]);
			}
		}
		int[] visited=new int[max_station];		//確定ノードかどうか
		visited[start]=1;	//startノードの処理
		
		
		
		//処理main
		while(true){
			//System.out.println("loop:"+count);
			int min=0;
			//未確定ノードの中で最短距離のノードを探索
			boolean flag=false;		//minの初期化用
			for(int i=0;i<TotalCost.length;i++){
				//System.out.println("@@@visited["+i+"]"+visited[i]);
				if(flag==false){
					if(visited[i]==0){
						min=i;	
						//System.out.println("Decide!!!!!!!!!min="+min);
						flag=true;
					}
				}else{		//はじめて良し
					//System.out.println("min="+min);
					//System.out.println("TotalCost[start]["+i+"]="+TotalCost[start][i]+"		,TotalCost[start][min]="+TotalCost[start][min]);
					if(visited[i]==0&&TotalCost[start][i]<TotalCost[start][min]){
						min=i;
						//System.out.println("***Update!!->min("+min+")");
					}	
				}
			}
			//System.out.println("decide MIN...min="+min);
			
			
			//if(count==4)System.exit(0);
			
			
			//未確定ノードを確定ノードに
			visited[min]=1;
			
			//ゴールノードに到達
			if(min==goal){
				//System.out.println("最短経路："+Best[start][goal]);
				return TotalCost[start][min];
			}
			//最短Costを更新
			//System.out.println(">>Update Distance");
			for(int i=0;i<estimate[min].length;i++){
				if(estimate[min][i]!=0&&i!=start){
					//System.out.println(">estimate["+min+"]["+i+"]:"+estimate[min][i]);
					int sub=TotalCost[start][min]+estimate[min][i];
					//System.out.println("sub="+sub+"		,TotalCost["+start+"]["+i+"]="+TotalCost[start][i]);
					if(sub<TotalCost[start][i]){
						TotalCost[start][i]=sub;		//最短costの更新
						//Best[start][i]=Best[start][min]+","+(i+1);
						//System.out.println("Change!:"+sub);
					}
				}
			}
		}
	}
}