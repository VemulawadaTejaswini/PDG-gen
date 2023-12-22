import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			int h = Integer.parseInt(std.next());
			int w = Integer.parseInt(std.next());
			if(h!=0 && w!=0){
				String line = "";
				String line2 = "#";
				for(int m=1; m<=w; m++){
					line += "#";
					line2 += ".";
				}
				line2 = line2.substring(0, w-1)+"#";
				System.out.println(line);
				for(int n=2; n<=h-1; n++){
					System.out.println(line2);
				}
				System.out.println(line);
				System.out.println();
			}else break;
		}
	}
}