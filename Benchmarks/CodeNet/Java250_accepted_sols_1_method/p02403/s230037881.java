import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			int h = Integer.parseInt(std.next());
			int w = Integer.parseInt(std.next());
			if(h!=0 && w!=0){
				String line = "";
				for(int m=1; m<=w; m++){
					line += "#";
				}
				for(int n=1; n<=h; n++){
					System.out.println(line);
				}
				System.out.println();
			}else break;
		}
	}
}