import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] lines = new int[w+1];
		for(int i =1; i<lines.length; i++){
			lines[i]=i;	//initialize lines[]
		}
		for(int i=0; i<n; i++){
			String s = sc.next();
			int a = Integer.parseInt(s.substring(0, s.indexOf(",")));
			int b = Integer.parseInt(s.substring(s.indexOf(",")+1,s.length()));
			lines = Swap(lines, a, b);
		}
		for(int i=1; i<lines.length; i++){
			System.out.println(lines[i]);
		}

	}
	static int[] Swap(int[] ints, int a, int b){
		int c = ints[a];
		ints[a]= ints[b];
		ints[b]= c;
		return ints;
	}

}