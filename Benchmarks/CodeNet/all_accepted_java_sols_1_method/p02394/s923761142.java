public class Main {
	public static void main(String[] age){
		String input = new java.util.Scanner(System.in).nextLine();
		String[] inputarray = input.split(" ");
		int W = Integer.parseInt(inputarray[0]);
		int H = Integer.parseInt(inputarray[1]);
		int x = Integer.parseInt(inputarray[2]);
		int y = Integer.parseInt(inputarray[3]);
		int r = Integer.parseInt(inputarray[4]);
		int z=0;

		if(x<r){
			z++;
		}else if(y<r){
			z++;
		}else if(W<x+r){
			z++;
		}else if(H<y+r){
			z++;
		}
		if(z==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}