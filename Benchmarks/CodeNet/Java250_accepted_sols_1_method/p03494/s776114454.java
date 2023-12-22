import java.util.Scanner;

public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] how = new int[a];

		for(int i=0 ; a>i ; i++) {
			int b = sc.nextInt();
			how[i]=b;
		}

		int count = 0;
		int z =0;
		while(true) {
			for (int i = 0; a>i; i++) {
				if (how[i]%2==1) {
					z = 1;
					break;
				}

				else if (how[i]%2==0) {
					how[i]=how[i]/2;

					if (i==(a-1)){
						count++;
					}
				}

			}
			if(z==1)
				break;
		}


		System.out.println(count);

	}

}
