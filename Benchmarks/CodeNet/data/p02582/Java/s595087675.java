import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();

        long [] Li =new long[101];
		for(int i=0;i<N;i++){
        	Li[i] = sc.nextInt();
        }
        
		int step;
        step=0;
      
		for(int i=0;i<N-2;i++){
        	for(int j=i+1;j<N-1;j++){
        		for(int k=j+1;k<N;k++){
                  if(Li[i]!=Li[j] && Li[j]!=Li[k] && Li[k]!=Li[i]){
                	if(Li[i]+Li[j]>Li[k] && Li[i]+Li[k]>Li[j] && Li[k]+Li[j]>Li[i]){
                      step=step+1;
                    }
                  }  
        		}
        	}
        }        
      
        // 出力
        System.out.println(step);
    }
}
