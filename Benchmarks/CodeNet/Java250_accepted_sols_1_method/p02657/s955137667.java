import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		String[] str = s.split(" ");
		int[] x = new int[str.length];
		
        for(int i = 0; i < str.length; i++){
            x[i] = Integer.parseInt(str[i]);
        }
        
        System.out.println(x[0] * x[1]);
    }
}