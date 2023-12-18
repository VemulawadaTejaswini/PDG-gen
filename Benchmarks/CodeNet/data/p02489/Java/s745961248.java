import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i = Integer.valueOf(input.nextLine());
		int j = 1;
		while(i != 0){
			System.out.println("Case " + j + ": " + i);
			try{
				i = Integer.valueOf(input.nextLine());
			}catch(Exception e){
				System.out.println("â×¦GÁ½");
			}
			j++;
		}
	}
}