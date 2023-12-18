import java.util.*;

public class Main {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		int i = 1;
		while(in.hasNext()) {
            String buf = in.nextLine();
            if(Integer.parseInt(buf) == 0){
            	break;
			}
            System.out.println("Case "+ i +": "+ buf);
            i++;
        }
	}
}