import java.util.*;

public class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		String str = new String();
		int i = 1;
		while(in.hasNext()) {
            String buf = in.nextLine();
            System.out.println("Case "+ i +": "+ buf);
            i++;
        }
	}
}