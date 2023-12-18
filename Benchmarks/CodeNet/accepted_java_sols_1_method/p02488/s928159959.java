import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		String tmp;
		
		for(int i=1;i<n;i++){
			tmp = scan.next();
			if(str.compareTo(tmp) > 0){
				str = tmp;
			}
		}
		
		System.out.println(str);
	}
}