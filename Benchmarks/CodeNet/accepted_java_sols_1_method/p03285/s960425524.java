
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int g = Integer.parseInt(scanner.nextLine());
		boolean x = false;

		for(int i = 0; i < 25; i++) {

				for(int j = 0; j < 15; j++) {

					if((i * 4 + j * 7) == g ) {

						x = true;
					}

				}
			}


		if(x)System.out.println("Yes");
		else System.out.println("No");






	}
}
