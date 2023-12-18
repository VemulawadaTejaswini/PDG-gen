import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		new Main().run();
	}
	public void run() {
		try {
			// ??????????????????????????????
			Scanner sc = new Scanner(System.in);
			for(;;){
				if(sc.hasNext()){
					int inputNumber = sc.nextInt();
					if(inputNumber > 0){
						int maxNum = inputNumber%2 == 0 ? inputNumber/2 : inputNumber/2 + 1;
						int nTmp = 0;
						Integer count = 0;
						for (int presentMaxNum = maxNum; presentMaxNum > 0; presentMaxNum--){
							for (int content = presentMaxNum; content > 0; content--) {
								nTmp = nTmp + content;
								if(nTmp < inputNumber) {
									continue;
								} else if (nTmp == inputNumber) {
									count++;
									nTmp = 0;
									break;
								} else if (nTmp > inputNumber) {
									nTmp = 0;
									break;
								}
							}
						}
						System.out.println(count-1);
					}
				} else {
					break;
				}
			}
		} catch (Exception e) {
			e.getStackTrace();
			System.exit(0);
		}
	}
}