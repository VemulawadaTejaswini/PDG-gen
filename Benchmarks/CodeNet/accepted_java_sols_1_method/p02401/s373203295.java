
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
                //スキャナーでa(整数) op(文字) b(整数) の式を読み取る
		while(true){
		    String s1 = sc.next();
		    int a = Integer.parseInt(s1);
		    String sop = sc.next();
		    char op = sop.charAt(0);
		    String s2 = sc.next(); 
		    int b = Integer.parseInt(s2);
		    
                    //文字に？が入ったらプログラムが終了する
		    if(op == '?'){
		    	break;
		    }
		    if(0 <= a && a <= 20000){
		    	if(0 <= b && b <= 20000){
		    		
                                //文字により処理を変え、計算結果を表示する
		    		if(op == '+'){
		    			System.out.println(a + b);
		    		}
		    		else if(op == '-'){
		    			System.out.println(a - b);
		    		}
		    		else if(op == '*'){
		    			System.out.println(a * b);
		    		}
		    		else if(op == '/'){
		    			System.out.println(a / b);
		    		}
		    	}
		    }
		}
	}

}