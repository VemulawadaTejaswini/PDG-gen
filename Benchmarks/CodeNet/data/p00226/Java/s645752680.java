import java.util.*;

class Main {
	String s1, s2;

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			s1 = in.next();
			s2 = in.next();
			if(s1.length() < 4) return ;
			solve();
		}
	}

	void solve(){
		int h = 0, b = 0;
		for(int i=0; i<4; i++){
			if(s1.charAt(i) == s2.charAt(i))
				h++;
		}
		for(int i=0; i<4; i++)
			for(int j=0; j<4; j++)
				if(i!=j && s1.charAt(i) == s2.charAt(j))
					b++;
		System.out.println(h + " " + b);
	}

	
	public static void main(String args[]){
		new Main().run();
	}
}