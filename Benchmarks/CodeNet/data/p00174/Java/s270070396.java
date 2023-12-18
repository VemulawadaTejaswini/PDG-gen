import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        new Main().run();
    }
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String game1 = scan.nextLine();
			if(game1.equals("0")){
				break;
			}
			String game2 = scan.nextLine();
			String game3 = scan.nextLine();
			int Ascore = 0;
			int Bscore = 0;
			for(int i = 1;i < game1.length();i++){
				if(game1.charAt(i) == 'A'){
					Ascore++;
				}else{
					Bscore++;
				}
			}
			if(game2.charAt(0) == 'A'){
				Ascore++;
			}else{
				Bscore++;
			}
			System.out.println(Ascore + " " + Bscore);
			Ascore = 0;
			Bscore = 0;
			for(int i = 1;i < game2.length();i++){
				if(game2.charAt(i) == 'A'){
					Ascore++;
				}else{
					Bscore++;
				}
			}
			if(game3.charAt(0) == 'A'){
				Ascore++;
			}else{
				Bscore++;
			}
			System.out.println(Ascore + " " + Bscore);
			Ascore = 0;
			Bscore = 0;
			for(int i = 1;i < game3.length();i++){
				if(game3.charAt(i) == 'A'){
					Ascore++;
				}else{
					Bscore++;
				}
			}
			if(Ascore > Bscore){
				Ascore++;
			}else{
				Bscore++;
			}
			System.out.println(Ascore + " " + Bscore);
		}
	}
}