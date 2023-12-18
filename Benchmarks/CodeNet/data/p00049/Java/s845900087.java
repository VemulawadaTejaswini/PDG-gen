import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		String t;
		int a = 0;
		int b = 0;
		int ab = 0;
		int o = 0;
		while(scan.hasNext()){
			t = scan.next();
			if(t == null){
				break;
			}
			String[] k = t.split(",", 0);
			if(k[1].equals("A")){
				++a;
			}else if(k[1].equals("B")){
				++b;
			}else if(k[1].equals("AB")){
				++ab;
			}else{
				++o;
			}
		}
		System.out.println(a + "\n" + b + "\n" + ab + "\n" + o);
	}
}