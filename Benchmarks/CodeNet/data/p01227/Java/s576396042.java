import java.io.*;
import java.util.*;

public class Main {
	
	private static ArrayList<Integer> xs;
	
	public static void main(String args[]) throws IOException{
		Scanner scr = new Scanner(System.in);
		int t = Integer.parseInt(scr.nextLine());
		for(int step=0; step<t; step++){
		    try{
				String[] str = scr.nextLine().split(" ", 0);
				int n = Integer.parseInt(str[0]);
				int k = Integer.parseInt(str[1]);
				xs = new ArrayList<Integer>();
				String[] strs = scr.nextLine().split(" ", 0);
				for(int i=0; i<n; i++){
					xs.add(Integer.parseInt(strs[i]));
				}
				if (n==0 && k==0) break; //??\?????????
				
				Starter(k);
			}catch(Exception e){
				System.err.println("TyialException");
				break;
			}
        }
		scr.close();
	}
	
	private static int[][] memo; // memo[k][start] <- start??\????????????????????§?????????
	private static void Starter(int k){
		memo = new int[k][xs.size()];
		for(int i=0; i<k; i++){
			for(int j=0; j<xs.size(); j++){
				memo[i][j] = Integer.MAX_VALUE;
			}
		}
		System.out.println( SetDinamo(k, 0) );
	}
	private static int SetDinamo(int k, int start){ //start??\???????¨????
		if(start>=xs.size()){	//NO_HOUSE
			return 0;
		}else if(memo[k-1][start] != Integer.MAX_VALUE){	//?????¢
			return memo[k-1][start];
		}else if(k==1){	//LAST_DINAMO
			memo[k-1][start] = xs.get(xs.size()-1) - xs.get(start);
			return memo[k-1][start];
		}else{
			for(int i=start; i<xs.size(); i++){
				int firlen = xs.get(i) - xs.get(start);
				int reslen = SetDinamo(k-1, i+1);
				memo[k-1][start] = (memo[k-1][start] <= firlen + reslen) ?
						memo[k-1][start] : firlen + reslen;
			}
			return memo[k-1][start];
		}
	}
}