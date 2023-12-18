import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuffer input = new StringBuffer(sc.next());
	
		int count = 0;
		int iter = N - 1;
		for(int i=0;i<iter;i++) {
			if(i == iter) {
				break;
			}
			if(input.charAt(i)== 'W') {
				int index = input.lastIndexOf("R");
				if(index == -1) {
					break;
				}
				if(index!= -1) {
					input.setCharAt(i, 'R');
					input.setCharAt(index, 'W');
					count = count + 1;
					iter = iter - 1;
				}
				
				
			}
		}
		System.out.println(count);
		

	}

}
