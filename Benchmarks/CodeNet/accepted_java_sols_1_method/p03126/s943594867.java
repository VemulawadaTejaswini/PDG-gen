import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int cnt = 0;
		int N = sc.nextInt();
      	int M = sc.nextInt();
      	boolean menu[][] = new boolean[N][M];
      	for(int i=0;i<N;i++){
        	for(int j=0;j<M;j++){
            	menu[i][j]= false;
            }
        }
      	for(int i=0;i<N;i++){
        	int K = sc.nextInt();
          	for(int j=0;j<K;j++){
            	int A = sc.nextInt();
              	menu[i][A-1] = true;
            }
        }
      	
      	for(int i=0;i<M;i++){
          	boolean flg = true;
        	for(int j=0;j<N;j++){
            	if(menu[j][i] ==false){
                  	flg = false;
                }
            }
          	if(flg){
            	cnt++;
            }
        }
      	
      	System.out.println(cnt);
    }
}