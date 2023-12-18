import java.util.Scanner;

public class Main {
		static int CARD_MAX=1000;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] taro =new String[n];
		String[] hana =new String[n];
		int taro_score=0;
		int hana_score=0;
		
		for(int i=0;i<n;i++){
			 taro[i] = scan.next();
			 hana[i] = scan.next();
			if(taro[i].compareTo(hana[i])==0){
				taro_score++;
				hana_score++;
			}else if(taro[i].compareTo(hana[i])>0){
				taro_score=taro_score +3;
			}else{
				hana_score= hana_score+3;
		}
		
			
		}

		System.out.println(taro_score+" "+hana_score);
		
	}



public static String shutffleString(String str,int h){
		String before = new String();
		String after = new String();

		for(int i = 0 ; i<h ; i++){
			before = before + str.charAt(i);
		}
		for(int i=h ; i < str.length() ;i++){
			after = after + str.charAt(i);
		}
			str = after + before;

	return str;
}

}