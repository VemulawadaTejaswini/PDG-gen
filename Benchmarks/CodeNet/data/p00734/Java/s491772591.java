import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	Main(){
		doIt();
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n =sc.nextInt();
			int m = sc.nextInt();

			if(n == 0 && m == 0){
				break;
			}

			ArrayList<Integer> taro = new ArrayList<>();
			ArrayList<Integer> hanako = new ArrayList<>();

			int taroSum = 0;
			int hanakoSum = 0;


			for(int i = 0; i < n; i++){
				int taroNum = sc.nextInt();
				taro.add(taroNum);
				taroSum+= taroNum;
			}
			for(int i = 0; i < m; i++){
				int hanakoNum = sc.nextInt();
				hanako.add(hanakoNum);
				hanakoSum += hanakoNum;
			}


			boolean flg = true;
			int dis = taroSum - hanakoSum;


			if(dis % 2 == 0){
				dis /= 2;
				if(dis > 0){//???????????????????????????
//					System.out.println("???????????????");
					for(int i = 1; i + dis <= 100; i++){
						if(hanako.contains(i)){
							if(taro.contains(i+dis)){
								System.out.println((i+dis)+" "+i);
								flg = false;
								break;
							}
						}
					}
				}else if(dis < 0){
					dis *= -1;
//					System.out.println("??±????????????");
//					System.out.println(dis);
					for(int i = 1; i <= 100; i++){
						if(taro.contains(i)){
//							System.out.println("?????????"+i);
							if(hanako.contains(i+dis)){
								System.out.println(i+" "+(i+dis));
								flg = false;
								break;
							}
						}
					}
				}else if(dis == 0){
					for(int i = 1; i <= 100; i++){
						if(taro.contains(i) && hanako.contains(i)){
							System.out.println(i+" "+i);
							flg = false;
							break;
						}
					}
				}
				if(flg){
					System.out.println(-1);
				}
			}else{
				System.out.println(-1);
			}

//			System.out.println(taro);
//			System.out.println(hanako);
		}

	}

	public static void main(String[] args) {
		new Main();
	}


}