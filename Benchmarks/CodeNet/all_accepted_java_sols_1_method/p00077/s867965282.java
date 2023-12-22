import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String str;

		while(sc.hasNext()){
			str = sc.next();
			char[] ch = str.toCharArray();

			for(int i = 0; i < ch.length; i++){
				if(ch[i] == '@'){
					for(int j = 0; j < ch[i + 1] - '0'; j++)
						System.out.print(ch[i + 2]);
					i += 2;
				}else{
					System.out.print(ch[i]);
				}
			}
			System.out.println();
		}
		sc.close();
	}
}