public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		scan.useDelimiter("//n");
		int count = 0;
		do{
			String W = scan.next();
			String str = scan.nextLine();
			char[] arr = str.toCharArray();

			if(str == "END_OF_TEXT"){
				break;
			}

			for(int i = 0;i <arr.length;i++){
				if(Character.isUpperCase(arr[i])){
					arr[i] = Character.toLowerCase(arr[i]);
				}
			for(int j = 0; j < arr.length;j++){
				String y = scan.next();
				if(str.indexOf(W) != -1){
					count++;
					}
				}
			}
		}while(scan.hasNext());
		System.out.println(count);
	}

}