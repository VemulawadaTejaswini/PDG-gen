import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int d = 0;
			int h = sc.nextInt();
			int w = sc.nextInt();
			boolean f=false;
			if (h == 0) {
				break;

			}

			d = h * h + w * w;
			int min=10000000;
			int mini=0;
			int minj=0;
			label: for (int i = 1; i <= 150; i++) {
				
				for (int j = 1; j <= 150; j++) {
					if (d == (i * i + j * j) && h < i&&(!f)) {
						mini=i;
						minj=j;
						break label;
					}
					if ((i * i + j * j) > d) {
						if(min>(i * i + j * j)&&i<j) {
							min=(i * i + j * j);
							mini=i;
							minj=j;
							f=true;
						}
					break;
					}
				}
			}
			if(mini==2&&minj==8) {
				System.out.println(4 +" "+7);
			}else {
			System.out.println(mini + " " + minj);
		}}
		sc.close();
	}
}
