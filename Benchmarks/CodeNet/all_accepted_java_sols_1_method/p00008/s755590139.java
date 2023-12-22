import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ティツ?ェテ・ツ仰陛ァツ板淌ヲツ按静」ツ?陛」ツつ古」ツ?淌」ツδ。テ」ツつステ」ツδε」ツδ嘉」ツδサテ」ツつケテ」ツつソテ」ツδ?
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int n = scan.nextInt();
			int count=0;
			for(int a=0;a<=9;a++){
				for(int b=0;b<=9;b++){
					for(int c=0;c<=9;c++){
						for(int d=0;d<=9;d++){
							if(a+b+c+d==n){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}