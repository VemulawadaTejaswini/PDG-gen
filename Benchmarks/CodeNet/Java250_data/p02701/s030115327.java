import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str;
        Set<String> A = new HashSet<String>();
        for(int i = 0 ; i < N ; i++){
            str = sc.nextLine();
            A.add(str);
        }
        System.out.println(A.size()); 
        sc.close();
    }
}