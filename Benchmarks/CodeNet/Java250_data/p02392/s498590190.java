import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int min=scanner.nextInt();
		int midium=scanner.nextInt();
		int max=scanner.nextInt();
		if(min<midium&&midium<max){
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
		
		scanner.close();
	}

}