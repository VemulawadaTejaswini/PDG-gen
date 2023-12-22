import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n;
		n = reader.nextInt();
		int may=0, cont;
		int hi[] = new int [100001];
		for(int i=1;i<=n; i++) {
			hi[i]=reader.nextInt();
		}
		cont=0;
		for(int i=1; i<=n-1; i++) {
			if(hi[i]>=hi[i+1]) {
				++cont;
			}else {
				if(cont>may) {
					may = cont;
				}
				cont=0;
			}
			if(i==n-1) {
				if(cont>may) {
					may = cont;
				}
			}
		}
		System.out.println(may);
		
	}

}
