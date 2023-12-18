public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		String str = scan.next();
		for(int i = 0; i < str.length();i++){
			char a = str.charAt(i);
			if(Character.isUpperCase(a)){
				System.out.print(Character.toLowerCase(a));
			}else{
				System.out.print(Character.toUpperCase(a));
			}
		}
		System.out.println();
	}

}