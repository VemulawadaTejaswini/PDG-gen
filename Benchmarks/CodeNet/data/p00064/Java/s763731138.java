import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(sc.hasNext()){
			
			char[] ch = sc.next().toCharArray();
			
		for(int i = 0; i < ch.length; i++){
			if(Character.isDigit(ch[i])){
				int x = ch[i++] - '0';
				while(Character.isDigit(ch[i])){
					x *= 10;
					x += ch[i++] - '0';
				}
				count += x;
			}
		}
	}
		System.out.println(count);
		
		sc.close();
	}
}