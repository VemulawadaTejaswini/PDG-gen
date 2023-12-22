import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int n=0;n<N;n++) {
			int Year = sc.nextInt();
			int Month = sc.nextInt();
			int day = sc.nextInt();
			
			int count = 0;
			
			for(int i=Year;i < 1000;i++) {
				for(int j=Month;j <= 10;j++) {
					if(i % 3 != 0 && j % 2 == 0) {
						for(int k=day;k <= 19;k++) {
							count++;
						}
					}else{
						for(int k =day; k <=20 ; k++) {
							count++;
						}
					}
					day = 1;
				}
				Month = 1;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
