import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		String s = in.next();
		int oversea = 0;
		int total = 0;
		for(int i=0;i<n;i++){
			char ch = s.charAt(i);
			if(ch == 'c')
				System.out.println("No");
			else if(ch == 'a'){
				if(total<a+b){
					total++;
					System.out.println("Yes");
				}
				else
					System.out.println("No");
			}
			else if(ch == 'b'){
				oversea ++;
				if(total<a+b && oversea<=b){
					total++;
					System.out.println("Yes");
				}
				else
					System.out.println("No");
			}
		}

	}

}
