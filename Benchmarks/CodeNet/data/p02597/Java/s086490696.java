import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int count =0;
		int front = 0;
		int last = N-1;
		String c = sc.next();
		StringBuilder cc = new StringBuilder(c);
		if(!(c.contains("W")&&c.contains("R"))) {
			System.out.println(0);
			return;
		}
		while(true) {
			for(int i=front; i<last; i++) {
				if(cc.substring(i,i+1).equals("W")) {
					for(int j=last; j>i;j--) {
//						System.out.println(i+" , "+j);
						if(i==j) {
							System.out.println(count);
							return;
						}
						if(cc.substring(j,j+1).equals("R")) {
							cc.setCharAt(i, 'R');
							cc.setCharAt(j, 'W');
							front = i-1;
							last = j;
							count++;
//							System.out.println("---------------");
							break ;
						}
					}
				}
			}
//			System.out.println(cc.toString());
			System.out.println(count);
			return;
		}

	}
}