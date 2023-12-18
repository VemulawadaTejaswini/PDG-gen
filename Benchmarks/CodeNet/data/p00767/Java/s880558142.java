import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int h = sc.nextInt();
				int w = sc.nextInt();
				if(h+w == 0) break;

				int dia = h * h + w * w;
				int min = Integer.MAX_VALUE;
				int minh = 151;
				int minw = 151;

				for(int i=1; i<150; i++) {
					for(int j=i+1; j<151; j++) {
						int dia2 = i * i + j * j;
						if(dia2 >= dia) {
							if(dia2==dia && h>=i) {
								continue;
							}
							if(min>dia2) {
								min = dia2;
								minh = i;
								minw = j;
							}
						}
					}
				}
				System.out.println(minh + " " + minw);
			}
		}
	}
}
