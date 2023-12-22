import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);

		int redHat = 0;

		int N = stdin.nextInt();
		stdin.nextLine();
		String s = stdin.nextLine();

		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'R')
				redHat++;
		}

		if(redHat > N-redHat){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
