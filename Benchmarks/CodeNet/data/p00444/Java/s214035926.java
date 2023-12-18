import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();

		while(true){
			int m = s.nextInt();
			if(m == 0){
				break;
			}

			int change = 1000 - m;

			a.add(count(change));
		}

		for(int i = 0; i < a.size(); i++){
			System.out.println(a.get(i));
		}

	}

	static int count(int change){
		int c = 0;
		while(change != 0){
			if(change >= 500){
				change -= 500;
				c++;
			}
			else if(change >= 100){
				change -= 100;
				c++;
			}
			else if(change >= 50){
				change -= 50;
				c++;
			}
			else if(change >= 10){
				change -= 10;
				c++;
			}
			else if(change >= 5){
				change -= 5;
				c++;
			}
			else if(change >= 1){
				change -= 1;
				c++;
			}
		}
		return c;
	}

}