import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] str = new String[n+1];
		
		for(int i = 0 ; i <= n ; i++){
			String line = sc.nextLine();
			line = line.replaceAll("Hoshino","Hoshina");
			str[i] = line;
			//System.out.println(i);
		}
		for(String z : str){
			System.out.println(z);
		}
		
		sc.close();
	}

}