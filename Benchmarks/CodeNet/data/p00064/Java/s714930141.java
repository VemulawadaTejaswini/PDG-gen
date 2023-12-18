import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int count = 0, x = 0;
		
		while(sc.hasNext()){
			char[] ch = sc.next().toCharArray();
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
		if(sc.hasNextLine() == false){
			System.out.println(count);
			break;
		}
		}
		
		sc.close();
	}
}