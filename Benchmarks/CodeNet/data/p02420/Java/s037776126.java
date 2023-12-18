import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String line = scan.next();//nextLine?????¨??????????????????????????§???
			if(line.equals("-")){
				scan.close();
				break;
			}
			int m = scan.nextInt();
			for(int i = 0; i < m; i++){
				int h = scan.nextInt();
				String subline1 = line.substring(0, h);
				String subline2 = line.substring(h);
				line = subline2.concat(subline1);
			}
			System.out.println(line);
		}
	}
}