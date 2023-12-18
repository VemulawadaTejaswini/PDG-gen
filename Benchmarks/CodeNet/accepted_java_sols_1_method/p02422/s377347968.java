import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			StringBuilder str = new StringBuilder(sc.next());
			int q = sc.nextInt();
			
			for(int i=0;i<q;i++) {
				String op = sc.next();
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(op.contentEquals("replace")) {
					str.delete(a, b+1);
					str.insert(a, sc.next());
				}else if(op.contentEquals("reverse")) {
					str.replace(a, b+1,new StringBuilder(str.substring(a,b+1)).reverse().toString());
				}else if(op.contentEquals("print")) {
					System.out.println(str.substring(a,b+1));
				}
			}
		}
	}
}
