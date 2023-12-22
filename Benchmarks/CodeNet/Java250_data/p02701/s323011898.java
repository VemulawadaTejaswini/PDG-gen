import java.util.*;

public class Main {
    
    public static List<Integer> P;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashSet<String> K = new HashSet<>();
        for(int i=0; i<N ; i++){
            K.add(scanner.next());
        }
        System.out.println(K.size());
    }
}