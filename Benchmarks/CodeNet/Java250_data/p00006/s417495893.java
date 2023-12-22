import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()){
			String str = scan.nextLine();
			int n = str.length();
			for(int i = n-1;i >= 0;i--){
				char t = str.charAt(i);
				System.out.print(t);
			}
			System.out.println();
		}
	}
}