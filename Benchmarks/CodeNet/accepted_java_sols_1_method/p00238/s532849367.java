import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int time=0;
		int sets=0;
		int mae=0,ato=0;
		int sum=0;
		while(sc.hasNext()) {
			time=sc.nextInt();
			if(time==0) {
				System.exit(0);
			}
			sets=sc.nextInt();
			sum=0;
			for(int i=0; i<sets; i++) {
				mae=sc.nextInt();
				ato=sc.nextInt();
				sum=sum+(ato-mae);
			}

			if(sum>=time) {
				System.out.println("OK");
			}
			else {
				System.out.println(time-sum);
			}
		}
	}
}
