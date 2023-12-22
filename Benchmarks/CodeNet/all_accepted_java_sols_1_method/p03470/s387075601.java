import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        List<Integer> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
        	list.add(sc.nextInt());
        }
        
        System.out.println(list.stream().distinct().count());
    }
    
}