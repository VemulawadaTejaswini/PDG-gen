import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			int runner=0;
			int score=0;
			int out=0;
			while(true){
				String str = cin.next();
				if(str.equals("HIT")){
					runner++;
					if(runner>=4){
						score++;
						runner--;
					}
				}
				else if(str.equals("HOMERUN")){
					score+=runner+1;
					runner=0;
				}
				else{
					out++;
				}
				if(out==3){
					break;
				}
			}
			System.out.println(score);
		}
	}

}