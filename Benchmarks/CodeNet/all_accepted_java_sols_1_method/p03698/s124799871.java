import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int check = 0;

		for (int i=0; i<str.length()-1; i++){
			char a = str.charAt(i);
			for (int j=i+1; j<str.length(); j++){
				char b = str.charAt(j);
				if (a == b){
					check++;
				}
			}
		}

		if (check == 0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}