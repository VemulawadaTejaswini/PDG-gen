import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int h = 0; h < n; h++){
			boolean[] base = {false,false,false};
			int score = 0;
			int count = 0;
			while(count != 3){
				String event = scan.next();
				switch(event){
				case "HIT":score = hit(base, score);break;
				case "OUT":count++;break;
				case "HOMERUN":score = homerun(base, score);break;
				}
			}
			System.out.println(score);
		}
	}

	private static int homerun(boolean[] base, int score) {
		int cnt = 0;
		while(base[cnt] == true){cnt++;}
		for(int i = 0; i < 3; i++){base[i] = false;}
		return score + cnt + 1;
	}

	private static int hit(boolean[] base, int score){
		int i;
		for(i = 0; i < 3; i++){
			if(base[i] == false){
				break;
			}
		}
		if(i == 3){
			score++;
		} else {
			base[i] = true;
		}

		return score;
	}
}