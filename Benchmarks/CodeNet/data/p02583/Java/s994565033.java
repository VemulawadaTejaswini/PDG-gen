import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();

        int [] Li =new int[101];
		for(int i=0;i<N;i++){
        	Li[i] = sc.nextInt();
        }
		
        
        int [] Lii =new int[101];
		for(int i=0;i<N;i++){
        	Lii[i] = Li[i]*Li[i];
        }
        
		int step;
        step=0;
      
		for(int i=0;i<N-2;i++){
        	for(int j=i+1;j<N-1;j++){
        		for(int k=j+1;k<N;k++){
                	if(Lii[i]+Lii[j]==Lii[k] || Lii[i]+Lii[k]==Lii[j] ||Lii[k]+Lii[j]==Lii[i]){
                      step=step+1;
                    }
        		}
        	}
        }        
      
        // 出力
        System.out.println(step);
    }
}
