import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		String[][] map = 
			{
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
		
		for(int i = 0; i < n; i++){
			for(String str : sc.next().split("0")){
				if(str.length() == 0){
					continue;
				}
				
				System.out.print(map[str.toCharArray()[0] - '1'][(str.length() - 1) % map[str.toCharArray()[0] - '1'].length]);
			}
			System.out.println();
		}
	}
}