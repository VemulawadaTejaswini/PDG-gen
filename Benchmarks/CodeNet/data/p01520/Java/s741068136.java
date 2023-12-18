import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?

		int N = 0, T, E;	//Nテ」ツ?ッテァツ?づヲツ卍づィツィツ暗」ツ?ョテ・ツ?凝ヲツ閉ー Tテ」ツ?ッテヲツクツャテ」ツつ甘」ツ?淌」ツ??ヲツ卍づゥツ鳴?Eテ」ツ?ッティツィツアテ・ツョツケティツェツ、テ・ツキツョ
							//T-Eテァツァツ津」ツ?凝」ツつ欝+Eテァツァツ津、ツサツ・テ・ツ??」ツ?ョテヲツ卍づゥツ鳴禿」ツつ津ヲツクツャテ」ツつ甘」ツ?淌」ツ??
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		T = sc.nextInt();
		E = sc.nextInt();
		
		int[] x = new int[N];
		
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		
		//テ」ツ?凖」ツ?ケテ」ツ?ヲテ」ツ?ョx[i]テ」ツ?ォテ・ツッツセテ」ツ?療」ツ?ヲテヲツ篠「テァツエツ「テ」ツ?凖」ツつ?
		boolean found = false;
		for(int i = 0; i < N; i++) {
			if(isCountable(x[i], T, E)) {
				System.out.println(i+1);
				found = true;
				break;
			}
		}
		if(found == false) System.out.println(-1);
		
	}

	/**
	 * xテ」ツ?ョテ・ツ?催ヲツ閉ーテ」ツ?卦-Eテ」ツ?凝」ツつ欝+Eテ」ツ?ョテァツッツ?・ツ崢イテ・ツ??」ツ?ォテ・ツ渉偲」ツ?セテ」ツつ凝」ツ?凝」ツ?ゥテ」ツ??」ツ?凝」ツつ津・ツ按、テ・ツョツ堙」ツ?凖」ツつ?
	 * @param x
	 * @param T
	 * @param E
	 * @return
	 */
	static boolean isCountable(int x, int T, int E) {
		/*
		 * テ」ツ?淌」ツ?ィテ」ツ?暗」ツ?ーx=10, T=100, E=2テ」ツ?ョテ」ツ?ィテ」ツ??
		 * 90, 100, 110テ」ツ??」ツ?妥ヲツ篠「テァツエツ「テ」ツ?凖」ツつ古」ツ?ーテ・ツ債?・ツ按?
		 * 90... (100-2)/10 * 10
		 * 110... ((100+2)/10 + 1) * 10
		 * 90 = 10nテ」ツ?ィテ」ツ?ェテ」ツつ凝」ツつ暗」ツ??」ツ?ォnテ」ツつ津・ツョツ堙」ツつ?」ツつ?
		 */
		
		int n = (T-E) / x;
		int search = n * x;
		do {
			if(T-E <= search && search <= T+E) return true;
			search = (++n) * x;
		}while(search <= T+E);
		
		return false;
	}
	
}