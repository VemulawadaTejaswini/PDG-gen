public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			int a = Integer.parseInt(scan.next());
			String op = scan.next();
			int b = Integer.parseInt(scan.next());

			if("+".equals(op)){
				System.out.println(a + b);
			}else if("-".equals(op)){
				System.out.println(a - b);
			}else if("*".equals(op)){
				System.out.println(a * b);
			}else if("/".equals(op)){
				System.out.println(a / b);
			}else if("?".equals(op)){
				break;
			}
		}
		scan.close();

	}

}