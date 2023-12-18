import java.util.*;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i = 10; i > 0; i--){
            if(i * 1000 - n < 1000) {
                System.out.println(i * 1000 - n);
				return;
            }
        }
	}
}