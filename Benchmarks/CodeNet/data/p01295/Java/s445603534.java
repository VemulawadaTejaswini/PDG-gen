import java.util.Scanner;

public class Main{
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String st = "";
			int s = Integer.parseInt(sc.next());
			int t = Integer.parseInt(sc.next());
			
			if(s == 0 && t == 0){
				break;
			}
			
			for(int i = 0; st.length() < t; i++){
				st = st + String.valueOf(i+s);
			}
			
			if(st.length() != t){
				st = st.substring(0, t);
			}
			
			System.out.println(st);
		}
	}
	
	public static void main(String[] args){
		new Main();
	}

}