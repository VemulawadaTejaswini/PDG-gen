import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n;
		String str, min = "";
		
		n = scn.nextInt();
		for (int i = 0; i < n; i++){
			str = scn.next();
			if (i > 0){
				if (str.compareTo(min) < 0){
					min = str;
				}
			}
			else {
				min = str;
			}
		}
		System.out.println(min);
		scn.close();
	}
}