import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int K =sc.nextInt();
		int days[][] = new int[N+1][7];//[日目][パターン] 両方1から パターン数を格納
		int pasta[] = new int[N+1]; //添字が日数　要素がパスタの種類 
		int result=0;//すべてのパターンの合計
		
		for(int i=1;i<N+1;i++){//days[] とpasta[]を0で初期化
			pasta[i]=0;
			for(int j=0;j<K+1;j++){
				days[i][j]=0;
			}
		}
		
		for(int i=1;i<K+1;i++){//パスタの情報分繰り返す
			int day =sc.nextInt();
			pasta[day] = sc.nextInt();//添字が日数　要素がパスタの種類
		}
		
		//1日目
		if(pasta[1]==0){ //１日目に指定がない場合
            days[1][2]=1;//1日目トマト１
            days[1][4]=1;//1日目クリーム１
            days[1][6]=1;//1日目バジル１
        }
        else if(pasta[1]==1){//1日目トマト１
        	days[1][2]=1;//1通り
        }
        else if(pasta[1]==2){//1日目クリーム１
        	days[1][4]=1;//1通り
        }
        else {//1日目バジル１
        	days[1][6]=1;//1通り
        }
		//以下二日目以降
		for(int i=2;i<N+1;i++){ //二日目からN日目まで繰り返す。
			if(pasta[i]==0){
				days[i][1]=days[i-1][2]%10000;
				days[i][3]=days[i-1][4]%10000;
				days[i][5]=days[i-1][6]%10000;
				days[i][2]=(days[i-1][3]+days[i-1][4]+days[i-1][5]+days[i-1][6])%10000;
				days[i][4]=(days[i-1][1]+days[i-1][2]+days[i-1][5]+days[i-1][6])%10000;
				days[i][6]=(days[i-1][1]+days[i-1][2]+days[i-1][3]+days[i-1][4])%10000;
            }
            else if(pasta[i]==1){
            	days[i][1]=days[i-1][2]%10000;
            	days[i][2]=(days[i-1][3]+days[i-1][4]+days[i-1][5]+days[i-1][6])%10000;
            }
            else if(pasta[i]==2){
            	days[i][3]=days[i-1][4]%10000;
            	days[i][4]=(days[i-1][1]+days[i-1][2]+days[i-1][5]+days[i-1][6])%10000;
            }
            else{
            	days[i][5]=days[i-1][6]%10000;
            	days[i][6]=(days[i-1][1]+days[i-1][2]+days[i-1][3]+days[i-1][4])%10000;
            }
        }
		for(int i=1;i<=6;i++){//全パターンを足す。
            result += days[N][i];
        }
        System.out.println(result%10000);
	}

}