import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String w=sc.next();
	    
	    char[] alpha = new char[26];//アルファベットの配列のオブジェクトを生成
	    
	    String str = "abcdefghijklmnopqrstuvwxyz";
	    for(int i = 0; i < 26; i++){
			alpha[i] = str.charAt(i);//alphaにアルファベットを格納
	    }
	    
	    int [] count = new int[26];//カウント回数を保存する配列オブジェクトを生成
	    
	    for(int i=0;i<w.length();i++){
	    	for(int j=0;j<26;j++){
	    		if(w.charAt(i) == alpha[j])//一致したら＋１する
					count[j]++;
	    	}
	    }
	    for(int i=0; i<26; i++){//判定を行う
	    	if(count[i]%2!=0){//偶数でないのが現れたら終わり
	    		System.out.println("No");
	    		System.exit(0);
	    	}
	    }
	    System.out.println("Yes");//前の判定を全てくぐり抜けたらyes
	}
}