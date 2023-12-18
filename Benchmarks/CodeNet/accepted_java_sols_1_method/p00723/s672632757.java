import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			String imput = sc.next();
			String [] a = new String[imput.length() - 1];
			String [] b = new String[imput.length() - 1];
			String [] answer = new String[(imput.length() - 1)  * 8];
			int counter = 0;
			String kanri;
			for(int j = 0; j < imput.length() - 1; j++){
				a[j] = imput.substring (0, j + 1);
				b[j] = imput.substring (j + 1);
			}
			for(int j = 0; j < a.length;j++){
				answer [j + j * 7] = a[j] + b[j];
				answer [1 + j + j * 7] = b[j] + a[j];
				StringBuilder a1 = new StringBuilder (a[j]);
				a1.reverse();
				String ra = new String (a1);
				answer [2 + j + j * 7] = ra + b[j];
				answer [3 + j + j * 7] = b[j] + ra;
				StringBuilder b1 = new StringBuilder (b[j]);
				b1.reverse();
				String rb = new String (b1);
				answer [4 + j + j * 7] = rb + a[j];
				answer [5 + j + j * 7] = a[j] + rb;
				answer [6 + j + j * 7] = ra + rb;
				answer [7 + j + j * 7] = rb + ra;
			}
			Arrays.sort(answer);
			kanri = answer[0];
			for(int j = 0; j < answer.length;j++){
				if(j == 0){
					counter++;
				}
				else if(!kanri.equals(answer[j])){
					counter++;
					kanri = answer[j];
				}
			}
			System.out.println(counter);
		}
	}

}