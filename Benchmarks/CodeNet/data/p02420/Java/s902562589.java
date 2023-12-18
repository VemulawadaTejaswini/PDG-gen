public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			String str = scan.next();
			int n = scan.nextInt();
			int h = scan.nextInt();
			if("-".equals(str)){
				break;
			}
			for(int i = 0; i < n;i++){
				str = str.substring(h)+str.substring(0, h);
			}
			System.out.println(str);

		}
	}

}