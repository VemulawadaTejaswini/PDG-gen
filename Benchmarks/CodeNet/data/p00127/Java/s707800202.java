import java.util.Scanner;

public class Main{
	String[] w = {
		"afkpuz",
		"bglqv.",
		"chmrw?",
		"dinsx!",
		"ejoty "
	};

	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String s = sc.next();
			int n = s.length();
			if(n%2 == 1){
				System.out.println("NA");
				continue;
			}
			n /= 2;
			for(int i = 0; i < n; i++){
				int x = Integer.parseInt(s.substring(2*i, 2*i+1));
				int y = Integer.parseInt(s.substring(2*i+1, 2*i+2));
				
				System.out.print(w[y-1].substring(x-1, x));
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}