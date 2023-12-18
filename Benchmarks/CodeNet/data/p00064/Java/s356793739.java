import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		char[] ch = sc.next().toCharArray();
		int count = 0, x = 0;
		
		for(int i = 0; i < ch.length; i++){
			if(Character.isDigit(ch[i])){
				x *= 10;
				x += ch[i] - '0';
			}
			else{
				count += x;
				x = 0;
			}
		}
		System.out.println(count);
		
		sc.close();
	}
}