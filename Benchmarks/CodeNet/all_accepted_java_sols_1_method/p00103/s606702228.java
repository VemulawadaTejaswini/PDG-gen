import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++){
			int out = 0;
			int runner = 0;
			int score = 0;
			
			while(out != 3){
				String str = sc.next();
				if("OUT".equals(str)){
					out++;
				}else if("HIT".equals(str)){
					runner++;
					if(runner > 3){
						score++;
						runner = 3;
					}
				}else if("HOMERUN".equals(str)){
					score += runner + 1;
					runner = 0;
				}
			}
			System.out.println(score);
		}
	}
}