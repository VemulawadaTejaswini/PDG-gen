import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		// スペース区切りの整数の入力
		String str = sc.next();
		String[] strArray = str.split("");
		int len = strArray.length % 2;
		if(len == 0) {
			len = strArray.length / 2;			
		}else{
			len = (strArray.length - 1) / 2;
		}
		int ans = 0;
		 
		// Mapの宣言
        Map<String,Integer> map = new HashMap<>();
        int i = 0;
        int j = strArray.length - 1;
		while(i <= len - 1) {
		    // 1文字ずつ表示
	        if (strArray[i].equals(strArray[j] )){
	        }else {
	        	map.put(strArray[i],1);
	        	ans ++;
	        }
			
			i++;
			j--;
		}

//		System.out.println(map.size());
		System.out.println(ans);



   		sc.close();
        return ;

    }
    
}

