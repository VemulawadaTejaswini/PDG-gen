import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
		int mp=0;
		int g = 0;
		for(int i=0;i<p.length;i++){
			p[i] = sc.nextInt();
			g += p[i];
			if(mp<p[i]){
				mp = p[i];
			}
		}
		g -= (int)mp/2;
		System.out.println(g);
	}
}
