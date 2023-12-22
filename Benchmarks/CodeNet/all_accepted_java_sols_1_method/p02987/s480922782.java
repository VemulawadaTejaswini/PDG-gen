import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		String[] spl = s.split("");
		String ss = spl[0];
		if(spl[1].equals(ss)){
			if(spl[2].equals(ss)){
				//AAAS
				System.out.println("No");
				return;
			}else{
				if(spl[3].equals(ss)){
					//AASA
					System.out.println("No");
					return;
				}else{
					if(spl[2].equals(spl[3])){
						//AASS
						System.out.println("Yes");
						return;
					}else{
						//AASD
						System.out.println("No");
						return;
					}
				}
			}
		}else{
			if(spl[2].equals(ss)){
				if(spl[1].equals(spl[3])){
					//ASAS
					System.out.println("Yes");
					return;
				}else{
					//ASAD
					System.out.println("No");
					return;
				}
			}else if(spl[2].equals(spl[1])){
				if(spl[3].equals(ss)){
					//ASSA
					System.out.println("Yes");
					return;
				}else{
					//ASSD
					System.out.println("No");
					return;
				}
			}else{
				//ASD*
				System.out.println("No");
				return;
			}
		}
	}
}