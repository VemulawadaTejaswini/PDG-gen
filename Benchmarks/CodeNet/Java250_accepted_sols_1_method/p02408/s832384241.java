import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		//Scanner????????????????????????
		Scanner scan = new Scanner(System.in);
		//?????°???????????????
		int n = scan.nextInt();

		ArrayList<Integer> sList = new ArrayList<Integer>();
		ArrayList<Integer> hList = new ArrayList<Integer>();
		ArrayList<Integer> cList = new ArrayList<Integer>();
		ArrayList<Integer> dList = new ArrayList<Integer>();
		int intCardVal = 13;
		int[] sAry = new int[intCardVal];
		int[] hAry = new int[intCardVal];
		int[] cAry = new int[intCardVal];
		int[] dAry = new int[intCardVal];
		for(int i = 0; i < intCardVal; i++){
			sAry[i] = 0;
			hAry[i] = 0;
			cAry[i] = 0;
			dAry[i] = 0;
		}

		int intCount = 0;

		while(scan.hasNextLine()){

			String strMark = scan.next();
			int intNum = scan.nextInt();

			if("S".equals(strMark)){

				sAry[intNum - 1] = intNum;

			}else if("H".equals(strMark)){

				hAry[intNum - 1] = intNum;
			}else if("C".equals(strMark)){

				cAry[intNum - 1] = intNum;
			}else if("D".equals(strMark)){

				dAry[intNum - 1] = intNum;
			}

			intCount++;
			if(intCount == n){
				scan.close();
				break;

			}
		}


		//????????????????????£???????????°?????????????????°??????list???????´?
		for(int i = 0; i < intCardVal; i++ ){

			if(sAry[i] == 0 ){

				sList.add( i + 1);
			}
			if(hAry[i] == 0){

				hList.add(i + 1);
			}
			if(cAry[i] == 0){

				cList.add(i + 1);
			}
			if(dAry[i] == 0){

				dList.add(i + 1);
			}
		}


		//??????????????????
		for(int i = 0; i < sList.size(); i++){

			System.out.print("S ");
			System.out.print(sList.get(i));
			System.out.println("");
		}

		//???????????????
		for(int i = 0; i < hList.size(); i++){

			System.out.print("H ");
			System.out.print(hList.get(i));
			System.out.println("");
		}

		//???????????????
		for(int i = 0; i < cList.size(); i++){

			System.out.print("C ");
			System.out.print(cList.get(i));
			System.out.println("");
		}

		//???????????????
		for(int i = 0; i < dList.size(); i++){

			System.out.print("D ");
			System.out.print(dList.get(i));
			System.out.println("");
		}

	}
}