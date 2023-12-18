import java.util.Scanner;

public class Main{
	char[] alp;
	int alpha, beta;
	
	Main(){
		Scanner sc = new Scanner(System.in);
		alp = new char[26];
		for(int i = 0; i < 26; i++){
			alp[i] = (char)('a'+i);
		}
		int n = Integer.parseInt(sc.nextLine());
		for(int k = 0; k < n; k++){
			String str = sc.nextLine();
			String res = "";
			char[] ch = str.toCharArray();
			alpha = 1;
			boolean f = true;
			do{
				for(beta = 0; beta < 26 && f; beta++){
					res = "";
					for(int i = 0; i < str.length(); i++){
						if(ch[i] == ' '){
							res += ch[i];
							continue;
						}
						res += alp[(alpha*(int)(ch[i]-'a')+beta)%26];
					}
					f = check(res);
				}
				for(alpha++; (alpha%2 == 0 || alpha%13 == 0) && f; alpha++);
			} while(f);
			
			System.out.println(res);
		}
	}
	
	boolean check(String str){
		String[] st = str.split(" ");
		boolean f = true;
		
		for(String s: st){
			if(s.equals("this") || s.equals("that")){
				f = false;
				break;
			}
		}
		
		return f;
	}
	
	public static void main(String[] args){
		new Main();
	}
}