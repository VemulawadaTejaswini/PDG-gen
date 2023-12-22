import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.next());
    	Integer a[] = new Integer[N];

    	for (int i=0; i<N; i++){
    		a[i] = Integer.parseInt(sc.next());
    	}

    	List<Integer> list = new ArrayList<>();

    	for (int num: a){
    		if (!list.contains(num)){
    			list.add(num);
    		}
    	}

    	System.out.println(list.size());

    }
}