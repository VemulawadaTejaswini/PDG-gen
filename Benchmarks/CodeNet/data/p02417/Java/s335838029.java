
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String scan="";
		while(sc.hasNext()) scan += sc.nextLine();
		scan = scan.toLowerCase();
		char abc[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int count[] = new int[abc.length];

		for(int i=0;i<scan.length();i++) {
			for(int j=0;j<abc.length;j++) {
				if(scan.charAt(i)==abc[j]) count[j]++;
			}
		}
		for(int i=0;i<abc.length;i++) {
			System.out.println(abc[i]+" : "+count[i]);
		}
	}

}

