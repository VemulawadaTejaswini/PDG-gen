import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] text = sc.next().split("", 0);
		int q = sc.nextInt();
		for(int i = 0; i < q; i++) {
			String msg = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int count = 0;
			if(msg.equals("replace")) {
				String[] str = sc.next().split("", 0);
				for(int y = a; y <= b; y++) {
					text[y] = str[count];
					count++;
				}
			}else if(msg.equals("reverse")) {
				String[] re = new String[b - a + 1];
				for(int j = b; j >= a; j--) {
					re[count] = text[j];
					count++;
				}
				count = 0;
				for(int x = a; x <= b; x++) {
					text[x] = re[count];
					count++;
				}
			}else {
				for(int y = a; y <= b; y++) {
					System.out.print(text[y]);
				}
				System.out.println();
			}
		}
	}
}

