import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int time = scan.nextInt();
		int planA = scan.nextInt();
		int planB = scan.nextInt();
		if(time * planA >= planB){
			System.out.println(planB);
		}else{
			System.out.println(time * planA);
		}
	}
}