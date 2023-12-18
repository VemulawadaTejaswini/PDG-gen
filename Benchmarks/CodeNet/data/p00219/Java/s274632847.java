import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int icegauretakazu = stdIn.nextInt();
			if(icegauretakazu==0){
				break;
			}
			int[] uretaice = new int[icegauretakazu];
			int[] kakuicenouretakazu = new int[10];

			for(int i=0;i<icegauretakazu;i++){
				uretaice[i]=stdIn.nextInt();
			}
			for(int i=0;i<uretaice.length;i++){
				switch (uretaice[i]){
				case 0:
					kakuicenouretakazu[0]++;
					break;
				case 1:
					kakuicenouretakazu[1]++;
					break;
				case 2:
					kakuicenouretakazu[2]++;
					break;
				case 3:
					kakuicenouretakazu[3]++;
					break;
				case 4:
					kakuicenouretakazu[4]++;
					break;
				case 5:
					kakuicenouretakazu[5]++;
					break;
				case 6:
					kakuicenouretakazu[6]++;
					break;
				case 7:
					kakuicenouretakazu[7]++;
					break;
				case 8:
					kakuicenouretakazu[8]++;
					break;
				case 9:
					kakuicenouretakazu[9]++;
					break;
				}
			}
			for(int i=0;i<10;i++){
				if(kakuicenouretakazu[i] != 0){
					for(int j=0;j<kakuicenouretakazu[i];j++){
						System.out.print('*');
					}
				}else{
					System.out.print('-');
				}
				System.out.println();
			}
		}
	}
}