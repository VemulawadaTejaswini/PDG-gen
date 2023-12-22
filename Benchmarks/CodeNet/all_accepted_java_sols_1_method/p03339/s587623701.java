import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String st = sc.next();
		boolean map[] = new boolean[st.length()];

		for(int n=0;n<st.length();n++){
			if(st.charAt(n) == 'E') map[n] = true;
			else map[n] = false;
		}
		
		int min = st.length()+1;
		int cnt = 0;
		for(int m=1;m<st.length();m++){
			if(map[m]) cnt++;
		}
		min = cnt;
		for(int n=1;n<st.length();n++){
			if(!map[n-1]) cnt++;
			if(map[n]) cnt--;
			if(min > cnt) min = cnt;
		}
		
		System.out.println(min);
	}
}