
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();

		List<Integer> listCardLankS = new ArrayList<Integer>();
		List<Integer> listCardLankH = new ArrayList<Integer>();
		List<Integer> listCardLankC = new ArrayList<Integer>();
		List<Integer> listCardLankD = new ArrayList<Integer>();

		List<String> listEgaraS = new ArrayList<String>();
		List<String> listEgaraH = new ArrayList<String>();
		List<String> listEgaraC = new ArrayList<String>();
		List<String> listEgaraD = new ArrayList<String>();

		for(int i = 1; i < 14; i++) {
			listCardLankS.add(i);
			listCardLankH.add(i);
			listCardLankC.add(i);
			listCardLankD.add(i);

			listEgaraS.add("S");
			listEgaraH.add("H");
			listEgaraC.add("C");
			listEgaraD.add("D");
		}

		for(int i = 0; i < A; i++) {
			String strA = sc.next();
			int intA = sc.nextInt();

		//	System.out.println("?????? : "+strA);
		//	System.out.println("????????? : "+intA);
			if(listEgaraS.contains(strA) && listCardLankS.contains(intA)) {
		//		System.out.println("?????????????????????????????£?????????");
				listEgaraS.remove(strA);
				listCardLankS.remove((Integer)intA);
			}
			if(listEgaraH.contains(strA) && listCardLankH.contains(intA)) {
		//		System.out.println("?????????????????????????????£?????????");
				listEgaraH.remove(strA);
				listCardLankH.remove((Integer)intA);
			}
			if(listEgaraC.contains(strA) && listCardLankC.contains(intA)) {
		//		System.out.println("?????????????????????????????£?????????");
				listEgaraC.remove(strA);
				listCardLankC.remove((Integer)intA);
			}
			if(listEgaraD.contains(strA) && listCardLankD.contains(intA)) {
		//		System.out.println("?????????????????????????????£?????????");
				listEgaraD.remove(strA);
				listCardLankD.remove((Integer)intA);
			}

		}

		for(int j : listCardLankS) {
			System.out.println("S "+j);
		}
		for(int j : listCardLankH) {
			System.out.println("H "+j);
		}
		for(int j : listCardLankC) {
			System.out.println("C "+j);
		}
		for(int j : listCardLankD) {
			System.out.println("D "+j);
		}
	}
}