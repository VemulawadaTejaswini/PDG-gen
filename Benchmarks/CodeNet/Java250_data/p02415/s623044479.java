public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str = scan.nextLine();
		for(int i = 0; i < str.length();i++){
			char arr = str.charAt(i);
			if(Character.isLowerCase(arr)){
				System.out.print(Character.toUpperCase(arr));
				}else{
					System.out.print(Character.toLowerCase(arr));
				}
		}
		System.out.println();
	}

}