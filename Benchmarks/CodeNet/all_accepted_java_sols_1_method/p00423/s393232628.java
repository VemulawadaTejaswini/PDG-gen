
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = 0;
		int ahand = 0;
		int bhand = 0;
		int ascore = 0;
		int bscore = 0;
		
		while(true){
			n = Integer.parseInt(std.next());
			if(n==0){break;}
			ahand = bhand = ascore = bscore = 0;
			
			for (int i=0; i<n; i++){
				ahand = Integer.parseInt(std.next());
				bhand = Integer.parseInt(std.next());
				if(ahand>bhand){
					ascore += (ahand+bhand);
				}else if(ahand==bhand){
					ascore += ahand;
					bscore += bhand;
				}else{
					bscore += (ahand+bhand);
				}
			}
		System.out.println(ascore +" "+ bscore);
		}
	}
}