import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String str1, str2;
		int hit, blow;
		char r[], a[];
		
		while(true){
			str1 = scan.next();
			str2 = scan.next();
			if(str1.equals("0") && str2.equals("0"))break;
		
			hit = 0;
			blow = 0;
		
			r = str1.toCharArray();
			a = str2.toCharArray();
		
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 4; j++){
					if(a[i] == r[j]){
						if(i == j)hit++;
						else blow++;
					}
				}
			}
			System.out.println(hit + " " + blow);
		}
	}
}