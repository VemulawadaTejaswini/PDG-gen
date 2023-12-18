
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < T; i++){
			ArrayList<Integer> listR = new ArrayList<Integer>();
			ArrayList<Integer> listG = new ArrayList<Integer>();
			ArrayList<Integer> listB = new ArrayList<Integer>();

			String[] strSuji = sc.nextLine().split(" ");
			String[] strColor = sc.nextLine().split(" ");

			for (int j = 0; j < 9; j++) {
				int kazu = Integer.parseInt(strSuji[j]);

				if (strColor[j].equals("R")){
					listR.add(kazu);
				}else if (strColor[j].equals("G")){
					listG.add(kazu);
				}else if (strColor[j].equals("B")){
					listB.add(kazu);
				}
			}
			Check insCheck = new Check(listR,listG,listB);

			System.out.println(insCheck.checkkk());
		}
		sc.close();
	}
}

class Check{
	ArrayList<Integer> listR = new ArrayList<Integer>();
	ArrayList<Integer> listG = new ArrayList<Integer>();
	ArrayList<Integer> listB = new ArrayList<Integer>();

	ArrayList<Integer> list1 = new ArrayList<Integer>();
	ArrayList<Integer> list2 = new ArrayList<Integer>();
	ArrayList<Integer> list3 = new ArrayList<Integer>();

	public Check(ArrayList<Integer> listR2, ArrayList<Integer> listG2, ArrayList<Integer> listB2) {
		this.listR = listR2;
		this.listG = listG2;
		this.listB = listB2;
	}

	public int checkkk(){
		int ans = 0;

		if(0 == listR.size() % 3 && 0 == listG.size() % 3 && 0 == listB.size() % 3){

			if(listR.size() != 0){
				Collections.sort(listR);

				for(int i = 0; i < listR.size(); i ++){
					list1.add(0);
				}

				for(int i = 0; i < listR.size(); i++){
					for(int j = i + 1; j < listR.size(); j++){
						for(int k = j + 1; k < listR.size(); k++){

							if(list1.get(i) == 0 && list1.get(j) == 0 && list1.get(k) == 0){
								if((listR.get(i) + 1) == listR.get(j)){
									if((listR.get(j) + 1 ) == listR.get(k)){

										list1.set(i,1);
										list1.set(j,1);
										list1.set(k,1);
									}
								}
							}
						}
					}
				}
				for(int i = 0; i < listR.size(); i++){
					for(int j = i + 1; j < listR.size(); j++){
						for(int k = j + 1; k < listR.size(); k++){

							if(list1.get(i) == 0 && list1.get(j) == 0 && list1.get(k) == 0){
								if(listR.get(i) == listR.get(j)){
									if(listR.get(j) == listR.get(k)){

										list1.set(i,1);
										list1.set(j,1);
										list1.set(k,1);
									}
								}
							}
						}
					}
				}
			}


			if(listG.size() != 0){
				Collections.sort(listG);

				for(int i = 0; i < listG.size(); i ++){
					list2.add(0);
				}

				for(int i = 0; i < listG.size(); i++){
					for(int j = i + 1; j < listG.size(); j++){
						for(int k = j + 1; k < listG.size(); k++){

							if(list2.get(i) == 0 && list2.get(j) == 0 && list2.get(k) == 0){
								if(listG.get(i)+1 == listG.get(j)){
									if(listG.get(j)+1 == listG.get(k)){

										list2.set(i,1);
										list2.set(j,1);
										list2.set(k,1);
									}
								}
							}
						}
					}
				}
				for(int i = 0; i < listG.size(); i++){
					for(int j = i + 1; j < listG.size(); j++){
						for(int k = j + 1; k < listG.size(); k++){

							if(list2.get(i) == 0 && list2.get(j) == 0 && list2.get(k) == 0){
								if(listG.get(i) == listG.get(j)){
									if(listG.get(j) == listG.get(k)){

										list2.set(i,1);
										list2.set(j,1);
										list2.set(k,1);
									}
								}
							}
						}
					}
				}
			}


			if(listB.size() != 0){
				Collections.sort(listB);

				for(int i = 0; i < listB.size(); i ++){
					list3.add(0);
				}

				for(int i = 0; i < listB.size(); i++){
					for(int j = i + 1; j < listB.size(); j++){
						for(int k = j + 1; k < listB.size(); k++){

							if(list3.get(i) == 0 && list3.get(j) == 0 && list3.get(k) == 0){
								if(listB.get(i)+1 == listB.get(j)){
									if(listB.get(j)+1 == listB.get(k)){

										list3.set(i,1);
										list3.set(j,1);
										list3.set(k,1);
									}
								}
							}
						}
					}
				}

				for(int i = 0; i < listB.size(); i++){
					for(int j = i + 1; j < listB.size(); j++){
						for(int k = j + 1; k < listB.size(); k++){

							if(list3.get(i) == 0 && list3.get(j) == 0 && list3.get(k) == 0){
								if(listB.get(i) == listB.get(j)){
									if(listB.get(j) == listB.get(k)){

										list3.set(i,1);
										list3.set(j,1);
										list3.set(k,1);
									}
								}
							}
						}
					}
				}
			}
		}

		if(listR.isEmpty() && listG.isEmpty() && listB.isEmpty()){
			ans = 1;
		}
		return ans;
	}
}