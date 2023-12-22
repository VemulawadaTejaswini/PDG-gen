public class Main {

	public static void main(String[] args) {
	
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int num = a;
		int num2 = b;
		
		if(num > num2){
			System.out.println("a"+" "+">"+" " +"b");
		}else if(num < num2){
			System.out.println("a"+" "+"<"+ " "+"b");	
		}else if(num == num2){
			System.out.println("a"+" "+ "==" +" " + "b");
		}

	}
}