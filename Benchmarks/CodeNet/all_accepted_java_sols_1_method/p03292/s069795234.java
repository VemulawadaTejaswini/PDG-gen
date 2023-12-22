import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<Integer>();
        for(int i=0;i<3;i++){
            li.add(sc.nextInt());
        }
        Collections.sort(li);
        System.out.println(li.get(2) - li.get(0));
    }
}