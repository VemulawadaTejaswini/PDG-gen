import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int kohosha, wan;
		kohosha = scn.nextInt();	//候補者数
		wan = scn.nextInt();	//小石数
		while (kohosha != 0 || wan != 0) {
			int[] temoto = new int[kohosha];
			int turn = 0;
			while(true){
				if(wan == 0){
					wan = temoto[turn];
					temoto[turn] = 0;
				}else{
					temoto[turn]++;
					wan--;
				}
				if(wan == 0){
					boolean eflg = true;
					for(int i = 0; i < kohosha; i++) if(i != turn && temoto[i] != 0){eflg = false; break;}
					if(eflg) break;
				}
				turn = Math.min(turn + 1, (turn + 1) % kohosha);
			}
			System.out.println(turn);
			kohosha = scn.nextInt();
			wan = scn.nextInt();
		}
	}
}