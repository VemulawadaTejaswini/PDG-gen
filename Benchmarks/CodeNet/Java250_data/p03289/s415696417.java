import java.util.*;
class Main{
	public static void main(String[] argv){
		//rated();
		accepted();
	}
	static void rated(){
		Scanner sc = new Scanner(System.in);
		int rate = sc.nextInt();
		if (rate<1200){
			System.out.println("ABC");
		}else{
			if(rate<2800){
				System.out.println("ARC");
			}else{
				System.out.println("AGC");
			}
		}
	}
	static void accepted(){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = "AC";
		/*
		*先頭がA
		*先頭から三文字目から後ろから二文字目の間にCをちょうどひとつ含む．
		*A，C以外は小文字
		*/
		if(s.charAt(0)!='A'){
			ans = "WA";
		}
		if(Character.isUpperCase(s.charAt(1))){
			ans = "WA";
		}
		
		boolean hasC = false;
		for(int i=2;i<s.length()-1;i++){
			if(Character.isUpperCase(s.charAt(i))){
				if(hasC){
					ans = "WA";
				}
				if(s.charAt(i)=='C'){
					hasC = true;
				}
			}
		}
		if(Character.isUpperCase(s.charAt(s.length()-1))||hasC==false){
			ans = "WA";
		}
		System.out.println(ans);
	}
}