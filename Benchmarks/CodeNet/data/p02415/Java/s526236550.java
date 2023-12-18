public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str = scan.next();
		char[] arr = str.toCharArray();
		for(char a: arr){
			if(Character.isUpperCase(a)){
				System.out.print(Character.toLowerCase(a));
			}else{
				System.out.print(Character.toUpperCase(a));
			}
		}
		System.out.println();
	}

}