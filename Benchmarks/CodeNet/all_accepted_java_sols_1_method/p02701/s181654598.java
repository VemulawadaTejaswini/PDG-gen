import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

		List<String> listA = new ArrayList<String>(); 
        
        for (int i=0; i<n; i++) {
			listA.add((scan.next()));
        }

        List<String> listB = new ArrayList<String>(new HashSet<>(listA));

//        System.out.println(listA);
//        System.out.println(listB);

        System.out.println(listB.size());
	    scan.close();	
    }
}