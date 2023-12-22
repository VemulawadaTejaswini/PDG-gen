import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = 0;
		int score = 0;
		String query = "";

		int north[] = {0,2,6,3,4,1,5};
		int east[] = {0,4,2,1,6,5,3};
		int west[] = {0,3,2,6,1,5,4};
		int south[] = {0,5,1,3,4,6,2};
		int right[] = {0,1,3,5,2,4,6};
		int left[] = {0,1,4,2,5,3,6};

		int dice[] = {0,1,2,3,4,5,6};
		int newdice[] = {0,1,2,3,4,5,6};

		while (true){
			//initialize
			score = 1;
			n = Integer.parseInt(std.next());
			if (n==0){break;}
			for (int i=1; i<7; i++){
				dice[i] = i;
				newdice[i] = i;
			}

			for (int i=0; i<n; i++){
				query = std.next();
				if (query.equals("North")){
					for (int j=1; j<7; j++){newdice[j] = dice[north[j]];}
				}else if (query.equals("East")){
					for (int j=1; j<7; j++){newdice[j] = dice[east[j]];}
				}else if (query.equals("West")){
					for (int j=1; j<7; j++){newdice[j] = dice[west[j]];}
				}else if (query.equals("South")){
					for (int j=1; j<7; j++){newdice[j] = dice[south[j]];}
				}else if (query.equals("Right")){
					for (int j=1; j<7; j++){newdice[j] = dice[right[j]];}
				}else if (query.equals("Left")){
					for (int j=1; j<7; j++){newdice[j] = dice[left[j]];}
				}

				score += newdice[1];
				for (int j=1; j<7;j++){
					dice[j] = newdice[j];
				}

			}

			System.out.println(score);
		}
	}
}