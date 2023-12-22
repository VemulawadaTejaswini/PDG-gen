import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int sysoutResult = 0;
		for(int i = 0; i < str.length(); i++){
				if(str.charAt(i) == '+'){
					sysoutResult += 1;
				}
				if(str.charAt(i) == '-'){
					sysoutResult -= 1;
				}
		}
		System.out.println(sysoutResult);
	}
}