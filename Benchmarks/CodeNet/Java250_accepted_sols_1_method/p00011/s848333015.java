import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int[] x = new int[w];
		for(int i = 0;i < w;i++){
			x[i] = i+1;
		}
		int n = scan.nextInt();
		for(int i = 0;i < n;i++){
			String str = scan.next();
			String[] strAry = str.split(","); 
			int a = Integer.parseInt(strAry[0]) - 1;
			int b = Integer.parseInt(strAry[1]) - 1;
			int t = x[a];
			x[a] = x[b];
			x[b] = t;
		}
		for(int i = 0;i < w;i++){
			System.out.println(x[i]);
		}
	}
}