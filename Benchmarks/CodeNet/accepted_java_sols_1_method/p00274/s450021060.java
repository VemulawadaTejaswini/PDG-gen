import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int[] po;
		while(true) {
			int sets=sc.nextInt();
			if(sets==0) {
				break;
			}
			else {
				po=new int[sets];
				int syurui=0;
				boolean ni_aru=false;
				int tmp=0;
				for(int i=0; i<sets; i++) {
					tmp=sc.nextInt();
					if(tmp>0) {
						syurui++;
					}
					if(tmp>=2) {
						ni_aru=true;
					}
				}

				if(ni_aru==false) {
					System.out.println("NA");
				}
				else {
					System.out.println(syurui+1);
				}
			}
		}
	}
}
