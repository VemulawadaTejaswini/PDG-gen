import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner r =new Scanner(System.in);
		int w = r.nextInt();
		int h = r.nextInt();
		int x = r.nextInt();
		int y = r.nextInt();
		int z = r.nextInt();
		if(z <= x && x <= (w -z) && z <= y && y <= (h - z)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}