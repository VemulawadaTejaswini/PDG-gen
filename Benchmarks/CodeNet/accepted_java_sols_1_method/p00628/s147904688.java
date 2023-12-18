import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			if("END OF INPUT".equals(str)) break;
			String[] stra = str.split(" ");
			for(int i = 0 ; i < stra.length ;i++){
				System.out.print(stra[i].length());
			}
			System.out.println();
		}
		sc.close();
	}

}