import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int counter = 0;
		int n = sc.nextInt();
		int[] s = new int [n];
		for(int i = 0; i < s.length; i++){
			s[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		int[] t = new int [q];
		for(int i = 0; i < t.length; i++){
			t[i] = sc.nextInt();
		}
		for(int i = 0; i < s.length; i++){
			for(int j = 0; j < t.length; j++){
				if(s[i] == t[j]){
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

}