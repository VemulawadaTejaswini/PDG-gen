import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        List<Integer> list = new ArrayList<>(100000);
        for (int i = A; i < Math.min(A+K, B); i++) {
        	list.add(i);
        }
        
        for (int i = Math.max(B-K+1, A); i <= B; i++) {
        	list.add(i);
        }
        
        
        list.stream().distinct().sorted().forEach(System.out::println);
        
    }
    
}