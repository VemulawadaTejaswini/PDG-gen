public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x;
		int y;
		if((x = scan.nextInt()) < (y = scan.nextInt())){
			System.out.println(x + " " + y);
		}else{
			System.out.println(y + " " + x);
		}

	}

}