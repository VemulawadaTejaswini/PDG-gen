import java.util.Scanner;
class Main{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
		while(true){
			int i = 1;
			int x = in.nextInt();
			if(x == 0){
				break;
			}
			System.out.println("Case " + i + ": " + x);
                        i++;
		}
	}
}
