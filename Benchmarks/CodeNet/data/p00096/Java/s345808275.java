import java.util.Scanner;
public class Main { 
	public static void main(String[] args){
	//	int count=0;
		int a=0;
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int count=0;
			long n = sc.nextInt();
			for (int i = 0;i<10;i++) {
				for(int j = 0;j<10;j++) {
					for(int k =0;k<10;k++) {
						for(int l = 0;l<10;l++) {
							
							a = i + j + k + l;
							if(a==n) count++;
						}
					}
				}

			}
			System.out.println(count);
		}
	}
}
