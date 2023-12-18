import java.util.*;
public class Main {
	public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //red
        int b = sc.nextInt(); //green
        int c = sc.nextInt(); //blue
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {

            if (b <= a) {
                b = b * 2;
            } else if (c <= b) {
                c = c * 2;
            }

        }

        String result = "No";
        if (b > a && c > b) {
            result = "Yes";
        }

        System.out.println(result);      

	}
}