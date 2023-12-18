import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] b = new int[n];
		int[] f = new int [n];
		int[] r = new int [n];
		int[] v = new int [n];
		int T = 0;
		for(int a = 0;a<n;a++){
			b[a] = scan.nextInt();
			f[a] = scan.nextInt();
			r[a] = scan.nextInt();
			v[a] = scan.nextInt();
		}
		for(int e =1;e<=4;e++){
			for(int c =1;c<=3;c++){
				for(int d = 1;d<=10;d++){
					T = 0;
					for(int g = 0;g<n;g++){
						if(b[g] == e && f[g] == c && r[g] == d){
							System.out.print(" " + v[g]);
							T = 1;
						}
					}
					if(T == 0){
						System.out.print(" 0");
					}
				}
				System.out.println("");
			}
			if(e != 4){
				System.out.println("####################");
			}
		}
	}
}