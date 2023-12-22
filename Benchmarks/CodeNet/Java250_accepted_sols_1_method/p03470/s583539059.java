import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.next());
    	Set<Integer> a = new HashSet<Integer>();

    	for (int i=0; i<N; i++){
    		a.add(Integer.parseInt(sc.next()));
    	}

    	System.out.println(a.size());
    }
}