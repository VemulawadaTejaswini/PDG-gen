import java.util.Scanner;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int[] line = new int[w + 1];
		for(int i = 1; i <= w; i++){
			line[i] = i;
		}
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String str = scan.next();
			String[] spl = str.split(",");
			int num1 = Integer.parseInt(spl[0]);
			int num2 = Integer.parseInt(spl[1]);
			int sub = line[num1];
			line[num1] = line[num2];
			line[num2] = sub;
		}
		for(int i = 1; i <= w; i++){
			System.out.println(line[i]);
		}
	}
}