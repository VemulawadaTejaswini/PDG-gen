import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String inStr = scn.nextLine();
		char[] charList = new char[inStr.length()];
		for(int i=0 ; i<charList.length ; i++) {
			charList[i] = inStr.charAt(i);
		}

		int cnt = 0;
		while(true){
			boolean isCnt = false;
			outside: for(int i= 0 ; i<charList.length ; i++) {
				if('K'==charList[i]) {
					charList[i] = 'A';
					for(int j=0 ; j<charList.length ; j++) {
						if('U'==charList[j]) {
							charList[j] = 'A';
							for(int k=0 ; k<charList.length ; k++) {
								if('P'==charList[k]) {
									charList[k] = 'A';
									for(int l=0 ; l<charList.length ; l++) {
										if('C'==charList[l]) {
											charList[l] = 'A';
											cnt++;
											isCnt = true;
											break outside;
										}
									}
								}
							}
						}
					}
				}
			}
			if(!isCnt)
				break;
		}
		System.out.println(cnt);
	}

}