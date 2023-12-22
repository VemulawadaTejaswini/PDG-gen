import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int num = Integer.parseInt(line);
        String[] elementStr = sc.nextLine().split(" ");

        HashSet<Integer>elem = new HashSet<Integer>();
      for(int i = 0; i < num ;i++) {
    	elem.add(Integer.parseInt(elementStr[i]));
    }



        if(elem.size() == elementStr.length) {
        	System.out.println("YES");
        }else {
        	System.out.println("NO");
        }

	}

}
