import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line;

		char bracket[][] = {{'(', ')'}, {'[', ']'}};
		int stack[] = new int[100];
		int index;

		while (true){
			line = sc.nextLine();
			if (line.equals(".")){
				break;
			}

			index = 0;

			out: for (int i = 0; i < line.length(); i++){
				char c = line.charAt(i);
				for (int j = 0; j < bracket.length; j++){
					if (c == bracket[j][0]){
						stack[index] = j;
						index++;
					}else if (c == bracket[j][1]){
						index--;
						if (index < 0 || j != stack[index]){
							index = -1;
							break out;
						}
					}
				}
			}

			if (index == 0){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

}