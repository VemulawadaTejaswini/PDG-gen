import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int goal = sc.nextInt();
		sc.close();
	
		int time=0;
		int x=0;
		while(true){
			x += time;
			if(x >= goal)
				break;
			time++;
		}
		System.out.println(time);

	}

}
