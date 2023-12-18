public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		scan.useDelimiter("//n");
		int count = 0;
		char[] arrt = new char[1000];
		do{
			String W = scan.next();
			String str = scan.nextLine();
			arrt = str.toCharArray();

			if(str == "END_OF_TEXT"){
				break;
			}

			for(int i = 0;i <arrt.length;i++){
				if(Character.isUpperCase(arrt[i])){
					arrt[i] = Character.toLowerCase(arrt[i]);
				}
				for(int j = 0; j < arrt.length;j++){
					if(str.indexOf(W) != -1){
						count++;
					}
				}
			}
		}while(scan.hasNext());
		System.out.println(count);
	}

}