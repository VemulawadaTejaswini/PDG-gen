import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] denkyu = new int[n];
    int[] tmpDenkyu = new int[n];
    for(int i = 0; i < n; i++){
    	denkyu[i] = sc.nextInt();
    	tmpDenkyu[i] = denkyu[i];
    }
    for(int i = 0; i < k; i++){
    	for(int j = 0; j < n; j++){
    		if(denkyu[j] == 0){
    			tmpDenkyu[j] ++;
    		}else{
    			int tmp = denkyu[j] * 2;
    			int tmppos = j - denkyu[j];
    			for(int m = 0; m <= tmp; m++){
    				if(tmppos + m >= 0 &&  tmppos + m < n)
    						if(tmppos + m != j)
    							tmpDenkyu[tmppos + m] ++;
    			}
    		}
    	}
    	for(int v = 0; v < n; v++){
    		denkyu[v] = tmpDenkyu[v];
    		tmpDenkyu [v] = 1;
    	}
    }
    for(int i = 0; i < n; i++){
    	System.out.print(denkyu[i]);
    }



  }
}