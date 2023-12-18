import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String question = sc.next();
			String answer = sc.next();
			if("00".equals(question + answer)){
				break;
			}
			int hit = 0;
			int blow = 0;
			//ヒット数
			for(int i=0;i<4;i++){
				if(question.charAt(i) == answer.charAt(i)){
					hit++;
				}
			}
			//ブロー数
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					if(i == j){
						continue;
					}
					if(question.charAt(i) == answer.charAt(j)){
						blow++;
					}
				}
			}
			System.out.println(hit+" "+blow);
		}
	}
}