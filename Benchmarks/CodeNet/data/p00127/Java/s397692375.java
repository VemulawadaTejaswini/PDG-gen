import java.util.Scanner;

public class Main{
	String[][] w = {
		{"a", "f", "k", "p", "u", "z"},
		{"b", "g", "l", "q", "v", "."},
		{"c", "h", "m", "r", "w", "?"},
		{"d", "i", "n", "s", "x", "!"},
		{"e", "j", "o", "t", "y", " "}
	};
	
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String str = sc.next();
			int n = str.length();
			if(n%2 == 1){
				n = 0;
			}
			String st = "";
			for(int i = 0; i < n; i+=2){
				int s = Integer.parseInt(str.substring(i, i+1))-1;
				int t = Integer.parseInt(str.substring(i+1, i+2))-1;
				if(s < 0 || s > 5 || t < 0 || t > 4){
					n = 0;
					break;
				} else {
					st += w[t][s];
				}
			}
			
			if(n == 0){
				System.out.println("NA");
			} else {
				System.out.println(st);
			}
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}