import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X,Y,kosu;
		double keisan;
		
		X=0;
		Y=0;
		keisan=0;
		kosu=0;
		
		for(int i=1;i<=N;i++) {
			X = sc.nextInt();
			Y = sc.nextInt();
			
			keisan = Math.sqrt(Math.pow(X,2)+Math.pow(Y,2));
			
			if(keisan<=D) {
				kosu++;
			}
		}
		
		System.out.println(kosu);
		sc.close();
	}

}