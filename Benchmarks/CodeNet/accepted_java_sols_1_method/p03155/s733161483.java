import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 掲示板のサイズ
		int N = sc.nextInt();
      	// 張り紙の高さ
      	int H = sc.nextInt();
      	// 張り紙の横幅
      	int W = sc.nextInt();
      	
      	int count=0;
      
      	for(int i=0;i<N;i++){
        	for(int t=0;t<N;t++){
				if((i+W<=N)&&(t+H<=N)){
      				count++;          	
                }
            }
        }
      	System.out.println(count);
    }
}