import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int h=sc.nextInt();
				int w=sc.nextInt();
				if((h|w)==0) break;
				int d=h*h+w*w;
				int d2=22500;
				int mini=0, minj=0;
				for(int i=1; i<=150; i++) {
					for(int j=i+1; j<=150; j++) {
						if(i*i+j*j>d) {
							if(i*i+j*j<d2) {
								d2=i*i+j*j;
								mini=i; 
								minj=j;
							}
						}
						if(i>h && i*i+j*j==d) {
							d2=i*i+j*j;
							mini=i; 
							minj=j;
						}
					}
				}
				System.out.printf("%d %d\n", mini, minj);
				
			}


		}
	}
}
