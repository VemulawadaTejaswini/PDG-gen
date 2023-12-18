public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		scan.useDelimiter("//n");
		int count = 0;
		do{
			String W = scan.next();
			String str = scan.nextLine();

			if(str == "END_OF_TEXT"){
				break;
			}
			for(int i = 0; i < str.length();i++){
				String y = scan.next();
				if(str.indexOf(W) != -1){
					count++;
				}
			}
		}while(scan.hasNext());
		System.out.println(count);
	}

}