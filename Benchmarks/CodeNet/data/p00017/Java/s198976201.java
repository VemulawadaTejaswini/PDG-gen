import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			for(int i = 1;i < 26;i++){
				String nstr = "";
				for(int j = 0;j < str.length();j++){
					char tc = str.charAt(j);
					if(tc == ' ' || tc == '.' || tc == '\n'){
						nstr += tc;
					}else{
						int t = (int)tc - i;
						nstr += (char)((t < 97)?t+26:t);
					}
				}
				if(nstr.indexOf("this") >= 0 || nstr.indexOf("that") >= 0 || nstr.indexOf("the") >= 0){
					System.out.println(nstr);
					break;
				}
			}
	}
}