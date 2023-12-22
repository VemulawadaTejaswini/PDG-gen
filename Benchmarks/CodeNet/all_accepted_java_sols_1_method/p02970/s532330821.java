import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int treeCount = Integer.parseInt(line[0]);
		int canWatch = Integer.parseInt(line[1])*2+1;
		for(int i = 1;i<=20;i++) {
			if(treeCount <= canWatch*i) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
	}
}