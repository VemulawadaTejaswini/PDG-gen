import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			String str = sc.next();
			for(int i = 1, l = str.length(); i < n; i++, l = str.length()){
				String s = sc.next();
				String st = func(str, s, l);
				l = s.length();
				str = func(s, str, l);
				if(str.length() > st.length()){
					str = st;
				} else if(str.length() == st.length()){
					if(str.charAt(0) > st.charAt(0)){
						str = st;
					}
				}
			}
			System.out.println(str);
		}
	}
	
	private String func(String str, String s, int l){
		int p = 0, k, o;
		String smax = "";
		for(int j = 0, m = s.length(); j < l; j++){
			if(str.substring(j, j+1).equals(s.substring(0, 1))){
				for(k = 1, o = l-j; k < m && k < o; k++){
					if(!(str.substring((j+k),(j+k+1)).equals(s.substring(k, k+1)))){
						break;
					}
				}
				if(p < k){
					p = k;
					smax = str.substring(j, j+k);
				}
			}
		}
		
		return str.replace(smax, s);
	}
	
	public static void main(String[] args){
		new Main();
	}
}