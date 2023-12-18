import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int p;
		int p1, p2;
		String op;

		p = sc.nextInt();

		String[][] stack = new String[p][1000];
		int[] index = new int[p];

		Arrays.fill(index, -1);

		while(true){

			op = sc.next();

			if(op.equals("push")){
				p1 = sc.nextInt()-1;
				index[p1]++;
				stack[p1][index[p1]] = sc.next();
			}else if(op.equals("pop")){
				p1 = sc.nextInt()-1;
				System.out.println(stack[p1][index[p1]]);
				index[p1]--;
			}else if(op.equals("move")){
				p1 = sc.nextInt()-1;
				p2 = sc.nextInt()-1;
				index[p2]++;
				stack[p2][index[p2]] = stack[p1][index[p1]];
				index[p1]--;
			}else if(op.equals("quit")){
				break;
			}

		}
		sc.close();
	}
}