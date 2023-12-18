import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();

		int n,m;
		String str;
		StringBuilder code = new StringBuilder();

		while((n = sc.nextInt()) != 0){

			for(int i = 0; i < n; i++)
				map.put(sc.next(), sc.next());

			m = sc.nextInt();
			for(int i = 0; i < m; i++){
				str = sc.next();

				if(map.containsKey(str))
					code.append(map.get(str));
				else
					code.append(str);
			}
			System.out.println(code.toString());
			code.setLength(0);
		}
		sc.close();
	}
}