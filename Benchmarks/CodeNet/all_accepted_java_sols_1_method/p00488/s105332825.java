import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] pasta = new int[3], juice = new int[2];
		int pmin = 0, jmin = 0;
		for(int i = 0; i < 3; i++){
			pasta[i] = sc.nextInt();
			if(pasta[pmin] > pasta[i]) pmin = i;
		}
		for(int i = 0; i < 2; i++){
			juice[i] = sc.nextInt();
			if(juice[jmin] > juice[i]) jmin = i;
		}
		
		System.out.println(pasta[pmin] + juice[jmin] - 50);
	}
}