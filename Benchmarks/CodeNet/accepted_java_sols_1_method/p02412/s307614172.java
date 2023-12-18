import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);

		while(true){
			int y = 0;
			int n = scan.nextInt();
			int x = scan.nextInt();
			if ((n==0) && (x==0)) break;
			for(int i=1; i<=n; i++){
				for(int i2=i+1; i2<=n; i2++){
					for(int i3=i2+1; i3<=n; i3++) {
						if ((x == (i + i2 + i3)) && (i!=i2) && (i!=i3) && (i2!=i3)) {
							y = y+1;
						}
					}
				}
			}
			System.out.println(y);
		}
		
	}

}