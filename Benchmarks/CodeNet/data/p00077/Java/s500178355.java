import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner	sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
		for(int i = 0 ; i < str.length() ; i++){
			if(str.charAt(i) == '@'){
				for(int j = 0 ; j < Integer.parseInt("" + str.charAt(i+1)) ; j++){
					System.out.print(str.charAt(i + 2));
				}
				i = i + 2;
			}else {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		}
		
		sc.close();
	}

}