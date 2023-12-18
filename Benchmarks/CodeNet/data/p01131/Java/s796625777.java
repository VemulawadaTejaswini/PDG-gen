import java.util.Scanner;

public class Main{
	String str[][] = {
		{},
		{".", ",", "!", "?", " "},
		{"a", "b", "c"},
		{"d", "e", "f"},
		{"g", "h", "i"},
		{"j", "k", "l"},
		{"m", "n", "o"},
		{"p", "q", "r", "s"},
		{"t", "u", "v"},
		{"w", "x", "y", "z"}
	};
	public Main(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			String st = sc.next();
			int m = st.length();
			for(int j = 0; j <= m-1;){
				String s = st.substring(j, j+1);
				int t = Integer.parseInt(s);
				int c = 0;
				int l = str[t].length;
				j++;
				for(; j <= m-1 && s.equals(st.substring(j, j+1)); j++, c++);
				if(l != 0){
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