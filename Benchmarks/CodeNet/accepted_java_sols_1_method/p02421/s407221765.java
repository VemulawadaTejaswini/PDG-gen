import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int scoreTarou = 0;
		int scoreHanako = 0;
		String tarouWord = null;
		String hanakoWord = null;

		for(int i = 0; i < n;i++){
			tarouWord = sc.next();
			hanakoWord = sc.next();
			if(tarouWord.compareTo(hanakoWord) < 0){
				scoreHanako += 3;
			}else if( 0 < tarouWord.compareTo(hanakoWord)){
				scoreTarou += 3;
			}else{
				scoreTarou ++;
				scoreHanako ++;
			}
		}
		System.out.printf("%d %d\n", scoreTarou, scoreHanako);
	}
}

