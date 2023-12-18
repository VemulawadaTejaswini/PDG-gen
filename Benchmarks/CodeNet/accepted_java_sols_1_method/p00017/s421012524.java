import java.util.Scanner;

public class Main{
	Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			
			for(int i = 0; i < 26; i++){
				int l = str.length();
				char[] ch2 = new char[l];
				for(int j = 0; j < l; j++){
					char w = ch[j];
					if(w == ' ' || w == '.'){
						ch2[j] = w;
						continue;
					}
					
					w = (char)(w+i);
					if(w > 'z'){
						w -= 26;
					}
					ch2[j] = w;
				}
				String[] st = (String.valueOf(ch2)).split(" ");
				boolean f = false;
				for(String s: st){
					if(s.equals("this") || s.equals("the") || s.equals("that")){
						f = true;
						break;
					}
				}
				if(f){
					System.out.println(String.valueOf(ch2));
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}