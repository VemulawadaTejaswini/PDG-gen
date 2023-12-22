import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			String line = std.nextLine();

			if(line.equals("-")){break;}

			int n = Integer.parseInt(std.nextLine());
			for(int i=0; i<n; i++){
				int index = Integer.parseInt(std.nextLine());
				String newline = line.substring(index, line.length());
				newline += line.substring(0,index);
				line = newline;
			}
			System.out.println(line);
		}
	}
}