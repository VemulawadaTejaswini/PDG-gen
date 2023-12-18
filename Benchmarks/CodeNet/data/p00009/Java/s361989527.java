import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean[] search = new boolean[10000000];
        Arrays.fill(search, true);
        for(int i = 2; i < 10000000; i++){
            // ?´???°????????°?????????????????????
            if(!search[i]){
                continue;
            }

            // ?´???°????????°?????????????????¨???
            for(int j = i * 2; j < 10000000; j += i){
                search[j] = false;
            }
        }

		while(sc.hasNext()) {
			int num = sc.nextInt();
			int count = 0;
			for(int i = 2; i <= num; i++) {
				if(search[i]){
	                count++;
	            }

			}
			System.out.println(count);
		}
	}

}