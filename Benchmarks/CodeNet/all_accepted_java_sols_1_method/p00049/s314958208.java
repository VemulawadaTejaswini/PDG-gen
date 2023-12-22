import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;
		while(sc.hasNext()){
			String str = sc.nextLine();
			String[] stra = str.split(",");
			if("AB".equals(stra[1])){
				ab++;
			} else if("B".equals(stra[1])){
				b++;
			} else if("A".equals(stra[1])){
				a++;
			} else{
				o++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
		sc.close();
	}

}