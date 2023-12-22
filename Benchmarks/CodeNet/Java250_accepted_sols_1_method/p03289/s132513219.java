
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean accepted=false;
		int Cp=0;
		if(str.charAt(0)=='A') {
			twoloop:for(int k=2;k<str.length()-1;k++) {
				if(str.charAt(k)=='C') {
					for(int j=0;j<str.length();j++) {
						if(str.charAt(j)=='C') {
							Cp++;
							continue;
						}
						if(str.charAt(j)=='A') continue;
						if(Character.isUpperCase(str.charAt(j))==true){
							break twoloop;
						}
					}
					accepted=true;
					break;
				}
			}
		}
		//System.out.println(Cp);
		if(accepted&&Cp==1) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}
	}

}
