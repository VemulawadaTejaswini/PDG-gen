class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			if(op.equals("?"))break;
			int b = sc.nextInt();
			switch(op){
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
			default:
				return;
			}
		}
	}
}
