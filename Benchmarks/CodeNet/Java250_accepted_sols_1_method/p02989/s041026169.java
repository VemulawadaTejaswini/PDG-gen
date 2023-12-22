import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextInt());
        }
        Collections.sort(li);
        System.out.println(li.get(n/2)-li.get(n/2-1));
    }
}
