import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<String> picList = new LinkedList<>();
		LinkedList<Integer> numList = new LinkedList<>();
		
		int trpData[][] = new int[13][4];
		//???????????£??\
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 13; i++) {
				trpData[i][j] = 0;
			}
		}
		
		int n = sc.nextInt();
		
		int i = 0;
		String pic = "";
		int num = 0;
		//????????°??????
		while(i < n) {
			pic = sc.next();
			num = sc.nextInt();
			if(pic.equals("S")) {
				trpData[num-1][0] = 1;
			} else if(pic.equals("H")) {
				trpData[num-1][1] = 1;
			} else if(pic.equals("C")) {
				trpData[num-1][2] = 1;
			} else if(pic.equals("D")) {
				trpData[num-1][3] = 1;
			}
			i++;
		}
		
		//?????????????´?
		int cnt = 0;
		for(int j = 0; j < 4; j++) {
			for(i = 0; i < 13; i++) {
				if(trpData[i][j] == 0) {
					if(j == 0) {
						picList.add("S"); 
					} else if(j == 1) {
						picList.add("H"); 
					} else if(j == 2) {
						picList.add("C"); 
					} else if(j == 3) {
						picList.add("D");
					}
					numList.add(i+1);
					cnt++;
				}
			}
		}
		
		//
		for(i = 0; i < cnt; i++) {
			System.out.println(picList.get(i) + " " + numList.get(i));
		}
	}
}