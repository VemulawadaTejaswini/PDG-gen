import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
      	String D = s.next(), m = D.substring(5,7);
      	if(m.equals("01") || m.equals("02") || m.equals("03") || m.equals("04")){
          System.out.println("Heisei");
        } else System.out.println("TBD");
	}
}
