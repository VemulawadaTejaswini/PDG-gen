import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int MAX = 1000000002;
		ArrayList<Integer> monster = new ArrayList<Integer>();
		ArrayList<Integer> heroes = new ArrayList<Integer>();
		int n;
		long maximo = 0;
		n = reader.nextInt();
		for(int i=0; i<n+1; i++)
			monster.add(reader.nextInt());
		for(int i=0; i<n; i++)
			heroes.add(reader.nextInt());
		
		for(int i=0; i<n;i++) {
			if(heroes.get(i) <= monster.get(i)) {
				maximo += heroes.get(i);
			}else {
				//heroes[i]-=monster[i];
				
				heroes.set(i, heroes.get(i) - monster.get(i));
				maximo+=monster.get(i);
				if(heroes.get(i)>=monster.get(i+1)) {
					maximo+=monster.get(i+1);
					monster.set(i+1, 0);
				}else {
					maximo+=heroes.get(i);
					monster.set(i+1, monster.get(i+1)-heroes.get(i));
					//monster[i+1]-=heroes[i];
				}
			}
		}
		System.out.println(maximo);
	}

}
