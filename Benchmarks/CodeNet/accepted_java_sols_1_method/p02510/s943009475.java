import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){	
				String str = sc.next();
					if(str.equals("-")){break;}
				int n = sc.nextInt();
			for(int i = 0;n > i;i++){
				int j = sc.nextInt();
					str = str.substring(j, str.length()) + str.substring(0, j);
			}
			System.out.println(str);
		}
	}
}