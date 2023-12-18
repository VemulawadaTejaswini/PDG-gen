import java.util.Scanner;

public class Main{
	String str[][] = {
		{" "},
		{"'", ",", ".", "!", "?"},
		{"a", "b", "c", "A", "B", "C"},
		{"d", "e", "f", "D", "E", "F"},
		{"g", "h", "i", "G", "H", "I"},
		{"j", "k", "l", "J", "K", "L"},
		{"m", "n", "o", "M", "N", "O"},
		{"p", "q", "r", "s", "P", "Q", "R", "S"},
		{"t", "u", "v", "T", "U", "V"},
		{"w", "x", "y", "z", "W", "X", "Y", "Z"}
	};
	public Main(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			String st = sc.next();
			int n = st.length();
			
			for(int i = 0; i < n;){
				String s = st.substring(i, i+1);
				int t = Integer.parseInt(s);
				int c = 0;
				int l = str[t].length;
				i++;
				if(s.equals("0")){
					for(; i <= n-1 && s.equals(st.substring(i, i+1)); i++, c++){
						System.out.print(" ");
					}
				} else {
					for(; i <= n-1 && s.equals(st.substring(i, i+1)); i++, c++);
					System.out.print(str[t][c%l]);
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		new Main();
	}
}