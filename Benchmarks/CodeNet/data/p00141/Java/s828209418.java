import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean[][] map;
	int n;
	boolean m2(int i, int j){
		if(i < 0 || i >= n || j < 0 || j >= n){
			return false;
		}	
		return !map[i][j];
	}
	boolean m3(int i, int j){
		if(i < 0 || i >= n || j < 0 || j >= n){
			return false;
		}	
		return map[i][j];
	}
	boolean check(int i, int j){
		if(!m2(i,j)){
			return false;
		}
		int[] di = {-1,0,1,0};
		int[] dj = {0,1,0,-1};
		int sum = 0;
		for(int z = 0; z< 4; z++){
			sum += m3(i+di[z],j+dj[z])?1:0;
		}
		return sum < 2;
	}
	void run(){
		int x = sc.nextInt();
		for(int z = 0; z < x ; z ++ ){
			if(z!=0){
				System.out.println();
			}
			n = sc.nextInt();
			map = new boolean[n][n];
			
			int[] di = {1,0,-1,0};
			int[] dj = {0,1,0,-1};
			int  i = 0 ; 
			int  j = 0 ;
			int dirc  = 0;
			map[i][j] = true;
			for(;;){
//				System.out.println(i+","+j);
				if(check(i+di[dirc],j+dj[dirc])){
					i+=di[dirc];
					j+=dj[dirc];
					map[i][j] = true;
				}else{
//					System.out.println("turn right");
					dirc++;
					dirc = dirc&3;
					if(check(i+di[dirc],j+dj[dirc])){
						i+=di[dirc];
						j+=dj[dirc];
						map[i][j] = true;
					}else{
						break;
					}
				}
			}
			for(i =0 ; i <n;i++){
				for(j =0 ; j < n ; j++){
					System.out.print(map[n-i-1][j]?'#':' ');
				}
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}