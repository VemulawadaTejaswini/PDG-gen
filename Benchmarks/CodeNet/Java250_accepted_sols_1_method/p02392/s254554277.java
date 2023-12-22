public class Main {
	public static void main(String[] age){
		String input = new java.util.Scanner(System.in).nextLine();
		String[] arrayinput = input.split(" ");
		int a = Integer.parseInt(arrayinput[0]);
		int b = Integer.parseInt(arrayinput[1]);
		int c = Integer.parseInt(arrayinput[2]);
		int z=0;
		if(a<b) z++;
		if(b<c) z++;
		if(z == 2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}