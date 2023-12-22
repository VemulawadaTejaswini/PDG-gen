import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		boolean flag = true;
		boolean C = false;
		for(int n=1;n<st.length();n++){
				if(!(0<=(st.charAt(n)-'a') &&(st.charAt(n)-'a')<=25)){
					if(!C && st.charAt(n) == 'C' && n!=1 && n!=st.length()-1) C = true;
					else flag = false;
				}
		}
		if(!C) flag = false;

		if(st.charAt(0) == 'A'){
		}else{
			flag = false;
		}

		if(flag) System.out.println("AC");
		else System.out.println("WA");

	}
}