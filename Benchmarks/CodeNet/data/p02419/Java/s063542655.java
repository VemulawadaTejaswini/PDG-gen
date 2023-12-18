public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		scan.useDelimiter("//n");
		int count = 0;
		do{
			String W = scan.next();
			String str = scan.nextLine();
			
			if("END_OF_TEXT".equals(str)){
				break;
			}
			if(W.equalsIgnoreCase(str)){
				count++;
			}
		}while(scan.hasNext());
		System.out.println(count);
	}

}