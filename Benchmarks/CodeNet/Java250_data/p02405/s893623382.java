
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		
	    Scanner sc = new Scanner(System.in);

	    while(true){
			
		//縦Hと横Wの値を受け取る
		String s1 = sc.next();
	        int H = Integer.parseInt(s1);
	        String s2 = sc.next();
	        int W = Integer.parseInt(s2);
	        
	        //値が条件（３００以下であるか）にあっているか確認
	        if(H <= 300 && W <= 300){
	        
	            //０と０が入力された時プログラムは終了する
	            if(H == 0 && W == 0){
	        	    break;
	            }
	            
	            //長方形になるよう出力
	            for(int i = 1; i <= H; i++){
	            	
	            	//奇数行のときは”＃””.”の順番で表示
	            	if(i % 2 == 1){
	            		for(int j = 1; j <= W; j++){
	            			if(j % 2 == 1){
	            				System.out.print("#");
	            			}
	            			else{
	            				System.out.print(".");
	            			}
	            		}
	            	}
	            	
	            	//偶数行のときは”.””#”の順番で表示
	            	else{
	            		for(int j = 1; j <= W; j++){
	            			if(j % 2 == 1){
	            				System.out.print(".");
	            			}
	            			else{
	            				System.out.print("#");
	            			}
	            		}
	            	}
	            	System.out.println("");
	            }
	            System.out.println("");
	        }
	    }     
	}
}