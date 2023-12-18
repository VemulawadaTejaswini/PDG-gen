import java.util.Scanner;
	public class Tiket{
		Scanner sc = new Scanner(System.in);
		int nban,nsyu;
		public void handan(){
			for(int i = 0; i<4; i++){
				nsyu = sc.nextInt();
				nban = sc.nextInt();
				switch (nsyu){
				case 1: System.out.println(nban*6000);break;
				case 2: System.out.println(nban*4000);break;
				case 3: System.out.println(nban*3000);break;
				case 4: System.out.println(nban*2000);break;
				}
			}


		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			Tiket t = new Tiket();
			t.handan();

		}

	}