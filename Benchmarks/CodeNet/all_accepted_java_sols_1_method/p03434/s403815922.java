import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        int alice =0;
        int Bob =0;
        for(int x=1;x<=n;x++) {
            list.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int x=1;x<=n;x++) {
            if(x%2==1) {
                alice+=list.get(x-1);
            }else{
                Bob+=list.get(x-1);
            }
        }
        System.out.println(alice-Bob);
    }
}
