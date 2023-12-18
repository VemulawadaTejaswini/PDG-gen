import java.util.*;
     
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	int game = N * (N - 1) / 2;
    	int[] point = new int[N];
    	int[] rank = new int[N];
    	int s = 0,num = 0,eq = -1;
    	
    	//試合結果入力、勝ち点判定
    	for(int i = 0;i < game;i++){
    		int A = sc.nextInt();
    		int B = sc.nextInt();
    		int C = sc.nextInt();
    		int D = sc.nextInt();
    		
    		if(C > D){
    			point[A - 1] += 3;
    		}else if(C < D){
    			point[B - 1] += 3;
    		}else{
    			point[A - 1] += 1;
    			point[B - 1] += 1;
    		}
    	}
    	
    	for(int j = 0;j < N;j++){
    		int max = 0;
    		for(int i = 0; i < N;i++){
    			if(point[i] > point[max])
    				max = i;
    		}
    		if(eq != point[max])
    			num++;
        	eq = point[max];
    		point[max] = 0;
    		rank[max] = num;
    	}
    	
    	for(int i = 0;i < N;i++){
    		System.out.println(rank[i]);
    	}
    }
}