import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int k = sc.nextInt();
			String s = sc.next();
			String array[] = new String[n];
			
			int i = 0;
			while(i < n) {
				array[i] = s.substring(i,i+1);
				i ++;
			}
			
			switch (array[k-1]) {
				case "A":
					array[k-1] = "a";
					break;
				case "B":
					array[k-1] = "b";
					break;
				case "C":
					array[k-1] = "c";
					break;
			}
			
			StringBuilder result = new StringBuilder();
			int j = 0;
			while (j < n) {
				result.append(array[j]);
				j ++;
			}
			System.out.println(result);
		}
	}
}
