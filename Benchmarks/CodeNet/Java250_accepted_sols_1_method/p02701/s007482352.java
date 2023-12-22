import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> listA = new ArrayList<String>();
        
        for(int i=0; i<n; i++) {
            listA.add(sc.next());
        }
        List<String> listB = new ArrayList<String>(new LinkedHashSet<>(listA));

        System.out.println(listB.size());
	}
}