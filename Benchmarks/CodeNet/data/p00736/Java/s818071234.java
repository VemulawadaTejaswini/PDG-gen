import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
	int p,q,r;
	class Token{
		/**
		 * 0 0 
		 * 1 1 
		 * 2 2
		 * + 3
		 * * 4
		 * p 5
		 * q 6
		 * r 7
		 * - 8
		 */
		int type;
		
		
		Token(String str){
			if(str.length() == 1){
				if(str.equals("0")){
					this.type = 0;
					return;
				}
				if(str.equals("1")){
					this.type = 1;
					return;
				}
				if(str.equals("2")){
					this.type = 2;
					return;
				}
				if(str.equals("P")){
					this.type = 5;
					return;
				}
				if(str.equals("Q")){
					this.type = 6;
					return;
				}
				if(str.equals("R")){
					this.type = 7;
					return;
				}
			}
			if(str.startsWith("-")){
				this.type = 8;
				this.child1 = new Token(str.substring(1));
				return;
			}
			int depth = 0;
			int tp = 0;
			for(int i = 1; i < str.length() - 1 ; i++){
				if(str.charAt(i) == '('){
					depth++;
					continue;
				}
				if(str.charAt(i) == ')'){
					depth--;
				}
				if(depth == 0){
					if(str.charAt(i) == '+'){
						this.type = 3;
						tp = i;
					}
					if(str.charAt(i) == '*'){
						this.type = 4;
						tp = i;
					}
				}
			}
			this.child1 = new Token(str.substring(1,tp));
			this.child2 = new Token(str.substring(tp+1,str.length()-1));
		}
		
		Token child1;
		Token child2;
		
		int getValue(){
			switch(type){
			case 0:
				return 0;
			case 1 :
				return 1;
			case 2 : 
				return 2;
			case 3 :
				return Math.max(child1.getValue() , child2.getValue());
			case 4 :
				return Math.min(child1.getValue() , child2.getValue());
			case 5 :
				return p;
			case 6 :
				return q;
			case 7 :
				return r;
			case 8 :
				return 2 - child1.getValue();
			}
			return -1;
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);

	
		for (;;) {
			String in = sc.next();
			if(in.equals(".")){
				break;
			}
			int sum = 0;
			Token t = new Token(in);
			for(p = 0; p < 3; p++){
				for(q = 0; q < 3; q++){
					for(r = 0; r < 3; r++){
						if(t.getValue() == 2){
							sum++;
						}
					}					
				}				
			}
			System.out.println(sum);
		}

	}

	public static void main(String[] Aregs) {
		Main a = new Main();
		a.run();
	}
}