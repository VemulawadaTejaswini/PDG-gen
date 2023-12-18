public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String W = scan.next();
		int count = 0;
		while(true){
			String str = scan.nextLine();

			if("END_OF_TEXT".equals(str)){
				break;
			}
			if(W.equalsIgnoreCase(str)){
				count++;
			}
		}
		System.out.println(count);
	}

}