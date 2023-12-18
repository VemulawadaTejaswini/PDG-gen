import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = 0, b = 0;
		try{
			a = Integer.valueOf(input.next());
			b = Integer.valueOf(input.next());
		}catch(Exception e){
			System.out.println("¦ç[");
		}
		System.out.print("a");
		if(a > b){
			System.out.print(" > ");
		}else if(a < b){
			System.out.print(" < ");
		}else{
			System.out.print(" == ");
		}
		System.out.println("b");
	}
}