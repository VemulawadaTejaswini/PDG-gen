import java.util.Scanner;
import java.util.*;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long sum = 1;

		for(int i = 0; i < n; i++){
			long a = scan.nextLong();
			sum*=a;
			if(sum>1000000000000000000L){
				sum=-1;
			}
			if(a==0)break;
			
		}

                System.out.println(sum);
    }
}
