import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	int cnt0 =0;
      	int cnt1 =0;
		String S = sc.next();
		for(int i=0;i<S.length();i++){
        	if(S.charAt(i)=='0'){
        		cnt0++;
        	}else{
        		cnt1++;
        	}
        }
      	if(cnt0>cnt1){
        	System.out.println(cnt1*2);	
        }else{
        	System.out.println(cnt0*2);
        }
      
      
    }
}