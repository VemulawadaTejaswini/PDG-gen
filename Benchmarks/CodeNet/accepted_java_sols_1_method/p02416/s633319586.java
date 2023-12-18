//8-B
import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true){
    		
            String num = sc.nextLine();
            
            int sum = 0;
            
            //0番目の文字が0だったらwhile抜ける
            if(num.charAt(0) == '0'){
            	break;
            }
            
            //入力されカ長さだけ呼び出して合計する
            for(int i = 0; i < num.length(); i++){
            	
            	//digit使い方　digit(char,整数)
            	//引数の整数部分に数字がいくつまで使えるかしていする
            	//例）9だったら　1?8まで　9だったら-が返される
            	//例）10だったら　1?9まで　10だったら-が返される
            	sum = sum + Character.digit(num.charAt(i),10);
                
            }
            
            System.out.println(sum);
        }

    }
}