import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		while(sc.hasNext()) {
			int[] a = new int[4];
			int[] b = new int[4];
			
			for(int i=0; i<4;i++) {
				a[i] = sc.nextInt();
			}
			for(int i=0; i<4; i++) {
				b[i] = sc.nextInt();
			}
			
			int hit = 0;
			int blow = 0;
			
			for(int i=0; i<4;i++) {
				if (a[i] == b[i]) {
					hit++;
				}else {
					for(int j=0; j<4; j++) {
						if(a[i] == b[j]) {
							blow++;
						}
					}
				}
			}
			System.out.print(hit +" ");
			System.out.println(blow);
			
		}	
	}
}

