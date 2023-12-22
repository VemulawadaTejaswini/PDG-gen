import java.util.*;


public class Main{
	public static void main(String[] args){
      	
      	// 値取得
    	Scanner sc = new Scanner(System.in);
      	String str = sc.next();
      	// System.out.println(str);
      	int cnt = 0;
      	// 文字列数分繰り返す
      	for(int i = 0; i < 4; i++){
      		// i文字目を取得する
      		char st = str.charAt(i);
      		// 他の文字と比較する
      		for(int j = 0; j < 4; j++){
      			char stt = str.charAt(j);
      			// 判定
	      		if (stt == st){
	      			cnt++;
	      			//System.out.println(cnt);
	    	  	}
      		}
      	}

      	if(cnt == 8){
      		System.out.println("Yes");
      	}else{
      		System.out.println("No");
      	}
    }
}