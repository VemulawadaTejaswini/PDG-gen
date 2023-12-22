import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int N[] = new int[6];
      	int cnt[] = new int[4];
      	for(int i=0;i<6;i++){
        	N[i] = sc.nextInt();
        }
      	Arrays.sort(N);
      	for(int i=1;i<5;i++){
          	int c = 0;
          	for(int j=0;j<6;j++){
            	if(N[j]==i){
                	c++;	
                }
            	cnt[i-1] =c;
            }
        }
      	Arrays.sort(cnt);
      	if(cnt[0] ==1 && cnt[1] == 1 && cnt[2] == 2 && cnt[3] == 2){
        	System.out.println("YES");
        }else{
        	System.out.println("NO");
        }		
    }
}