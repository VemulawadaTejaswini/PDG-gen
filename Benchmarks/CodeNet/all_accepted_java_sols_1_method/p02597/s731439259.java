import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String altar = sc.nextLine();
		
		int left = 0;
		int right = altar.length() -1;
		int out = 0;
		while(left < right) {
			char leftcolor = altar.charAt(left);
			char rightcolor = altar.charAt(right);
			if(leftcolor == 'W' && rightcolor == 'R') {
				out++;
				right--;
				left++;
			}
			else {
				if(rightcolor == 'W') right--;
				if(leftcolor == 'R') left++;
			}
		}
		
		System.out.println(out);
	}
}
