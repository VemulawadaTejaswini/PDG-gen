import java.util.Scanner;

//20180510
//08

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while(true) {
			String string = scanner.next();
			if("-".equals(string)){
				break;
			}
			int count = scanner.nextInt();
			for(int i = 0;i < count;i++) {
				int shuffle = scanner.nextInt();
				String tmp = string.substring(0, shuffle);
				String out = string.substring(shuffle);
				string = out + tmp;
			}
			System.out.println(string);
		}
		scanner.close();
    }
}
