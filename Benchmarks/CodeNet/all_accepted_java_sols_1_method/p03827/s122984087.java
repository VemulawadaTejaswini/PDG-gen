import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int x = 0,xMax = 0;
		for(int i=0;i<s.length();i++){
//			char c = s.charAt(i);
//			switch(c){
//			case 'I':{
//				x++;
//				break;
//			}
//			case 'D':{
//				x--;
//				break;
//			}
//			}
			if(s.charAt(i) == 'I') x++;
			else x--;
			xMax = Math.max(xMax, x);
		}
		System.out.println(xMax);

	}

}