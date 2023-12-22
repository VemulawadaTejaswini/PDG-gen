import java.util.*;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){

		// 値取得
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> strodd = new ArrayList<>();
		ArrayList<String> streve = new ArrayList<>();

		// System.out.println(str);
	 	// 奇数・偶数文字切り分け
		for(int i=1;i<=str.length();i++){

			if( i % 2 == 0){
				//偶数
				streve.add(str.substring(i-1,i));

			}else{
				// 奇数
				strodd.add(str.substring(i-1,i));
				// System.out.println(strodd.get(i-1));				
			}
		}

		
		boolean abc = true;
		boolean abd = true;
		for(int k = 0;k<strodd.size();k++ ){
			// System.out.println(strodd.get(k));
			if(!(strodd.get(k).contains("R") || strodd.get(k).contains("U") || strodd.get(k).contains("D"))){
				abc = false;
			}
		}

		for(int l = 0;l<streve.size();l++ ){
			// System.out.println(streve.get(l));
			if(!(streve.get(l).contains("L") || streve.get(l).contains("U") || streve.get(l).contains("D"))){
				abd = false;
			}
		}


		if(abc && abd){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
