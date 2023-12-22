import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String m = in.nextLine();
		boolean n = false, w = false, s = false, e = false;
		for(int i = 0; i < m.length(); i++){
			switch(m.charAt(i)){
			case 'N': n = true; break;
			case 'W': w = true; break;
			case 'S': s = true; break;
			case 'E': e = true; break;
			}
		}
		if(n && w && s && e || n && s && !w && !e || !n && !s && w && e){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}