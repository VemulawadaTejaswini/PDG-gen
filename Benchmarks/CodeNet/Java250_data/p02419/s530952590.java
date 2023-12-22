import java.util.Scanner;

public class Main {
	static int list[] = new int[26];
	public static void main(String[] args) {
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		String W = scan.nextLine();
		try{
			while(scan.hasNext()){
				String T = scan.next();
				if(T.equals("END_OF_TEXT")){
					scan.close();
				}else if(W.equalsIgnoreCase(T)){
					cnt++;
				}
			}
		}catch(IllegalStateException e){
			System.out.println(cnt);
		}
	}
}