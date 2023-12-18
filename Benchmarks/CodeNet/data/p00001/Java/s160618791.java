import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> m =  new ArrayList();

        for(int i=0;i<10;i++) {
        	m.add(sc.nextInt());
        }
        Collections.sort(m);
        Collections.reverse(m);
        
        for(int i=0;i<3;i++) {
            System.out.println(m.get(i));
        }
	}
}