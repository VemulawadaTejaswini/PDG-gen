import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hit, blow;
		int a[] = new int[4];
		int b[] = new int[4];

		while(sc.hasNext()){
			hit = blow = 0;

			for(int i = 0; i < 4; i++){
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < 4; i++){
				b[i] = sc.nextInt();
			}

			for(int i = 0; i < 4; i++){
				if(a[i] == b[i]) hit++;
				else{
					for(int j = 0; j < 4; j++){
						if(a[i] == b[j]) blow++;
					}
				}
			}

			System.out.println(hit + " " + blow);
		}
	}
}