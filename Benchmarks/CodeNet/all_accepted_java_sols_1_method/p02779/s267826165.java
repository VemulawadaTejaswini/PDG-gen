import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Integer> numList = new ArrayList<>();
        for(int i=0;i<N;i++){
            numList.add(Integer.parseInt(sc.next()));
        }
        long count = numList.stream().distinct().count();
        String str = N == count ? "YES" : "NO";
        System.out.println(str);
}
}