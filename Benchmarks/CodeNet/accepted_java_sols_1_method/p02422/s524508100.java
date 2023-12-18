import java.util.Scanner;

public class Main{
	public	static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int q = sc.nextInt();
		
		for(int i= 0; i < q ; i++) {
			String order = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			switch (order) {
				case "print":
					 System.out.println(str.substring(a,b+1));
					break;
			
				case "reverse":
					StringBuffer sb = new StringBuffer(str.substring(a,b+1));
					String rvs = sb.reverse().toString();
					str = str.substring(0,a) + rvs + str.substring(b+1);
					break;
					
				case "replace":
					String p = sc.next();
					str = str.substring(0,a) + p + str.substring(b+1);
					break;
			}
		}
	}
}

