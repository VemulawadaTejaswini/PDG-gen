import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nummax = sc.nextInt();
		String astring = sc.next();
		String bstring = sc.next();
		String cstring = sc.next();

		int ans = 0;

		for (int i =0;i < nummax; i++) {

			if(!astring.substring(i,i+1).equals(bstring.substring(i,i+1))){
				ans++;
			}
			if(!astring.substring(i,i+1).equals(cstring.substring(i,i+1)) &&
					!bstring.substring(i,i+1).equals(cstring.substring(i,i+1)) 	){
				ans++;
			}
		}
		System.out.println(ans);
	    sc.close();

	}

}