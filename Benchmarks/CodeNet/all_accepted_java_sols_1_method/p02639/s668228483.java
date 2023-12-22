import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
		int ans = 0;
		for(int i = 0; i < 5; i++){

		int n = scan.nextInt();
		if(n == 0){
			ans = i + 1;
		}
		}

                System.out.println(ans);
    }
}
