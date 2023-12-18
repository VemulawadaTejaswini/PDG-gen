import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        
        List<String> list = Arrays.asList(sc.nextLine().split(" "));
        Set<String> set = new HashSet<>(list);
        if(list.size() == set.size()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}