import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int w, n, pos;
		String string;
		String[] strings;

		w = sc.nextInt();
		n = sc.nextInt();
		int[] endPos = new int[w];
		int[] na = new int[n];
		int[] nb = new int[n];
		for(int i = 0; i < n; i++){
			string = sc.next();
			strings = string.split(",");
			na[i] = Integer.parseInt(strings[0]);
			nb[i] = Integer.parseInt(strings[1]);
		}

		for(int i = 0; i < w; i++){
			pos = i + 1;
			for(int j = 0; j < n; j++){
				if(pos == na[j]) pos = nb[j];
				else if(pos == nb[j]) pos = na[j];
			}
			endPos[pos - 1] = i + 1;
		}

		for(int value: endPos){
			System.out.println(value);
		}
	}
}