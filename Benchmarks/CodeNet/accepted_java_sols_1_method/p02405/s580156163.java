import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Hcount,Wcount;

		while(true){
			Hcount = sc.nextInt();
			Wcount = sc.nextInt();

			if(Hcount ==0 && Wcount ==0) {
				break;
			}
			for(int i =0; i<Hcount;i++) {
				if(i%2==0){
					for(int x =0; x<Wcount;x++) {
						if(x%2==0)
							System.out.print("#");
						else
							System.out.print(".");
					}
					}else {
						for(int x =0; x<Wcount;x++) {
							if(x%2==0)
								System.out.print(".");
							else
								System.out.print("#");
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
