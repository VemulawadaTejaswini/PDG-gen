
import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		
		//スキャナーで整数を３つ読み取る
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next();
	    int a = Integer.parseInt(s1);
	    String s2 = sc.next();
	    int b = Integer.parseInt(s2);
	    String s3 = sc.next();
	    int c = Integer.parseInt(s3);
	    int sum = 0;
	    
	    //整数a、b、cが条件（１から１００００）内かつ、a<=bであるか確認
	    if(1 <= a && a <= 10000){
	    	if(1 <= b && b <= 10000){
	    		if(1 <= c && c <= 10000){
	    			if(a <= b){
	    					
	    			    //c約数がaからbまでの中に何個あるか計算
	    				for(int i = a; i <= b; i++){
	    					if(c % i == 0){
	    					    sum++;
	    					}
	    				}
	    				
	    				//約数の数を表示
	    				System.out.println( sum );
	    			}
	    		}
	    	}
	    }
	}
}