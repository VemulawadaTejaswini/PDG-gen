import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int N = sc.nextInt();
		ArrayList<Integer> kouho = new ArrayList<>();
		for(int i = 0 ; i < 26 ; i++){
			for(int j = 0 ; j < 18 ; j++){
				kouho.add(4*i+7*j);
			}
		}
		if(kouho.indexOf(N) == -1)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
