import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int N=t.nextInt(), X=t.nextInt(), cont =1, soma=0;
		int L[] = new int[N];
		for(int i = 0; i < N; i++) {
			L[i] = t.nextInt();
			soma += L[i];
			if(soma <= X) {
			cont += 1;
		}
		}
	
		System.out.println(cont);
	}
}