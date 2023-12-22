import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String w;
		int n;

		while(scan.hasNext()){
			w = scan.next();
			char ch[] = w.toCharArray();
			
			for(int i = 0; i < ch.length; i++){
				if(ch[i] == '@'){
					n = Integer.parseInt("" + ch[i + 1]);
					for(int j = 0; j < n; j++){
						System.out.print(ch[i + 2]);
					}
					i += 2;
				}else System.out.print(ch[i]);
			}
			System.out.println();
		}
	}
}