import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next()+"+";
        int k = sc.nextInt();
        LinkedHashSet<String> hashset = new LinkedHashSet<>();
        for (int i=1;i<=k;i++){
            for (int j=0;j<=s.length()-i-1;j++){
                hashset.add(s.substring(j,j+i));
            }
        }
        ArrayList<String> array = new ArrayList<>(hashset);
        Collections.sort(array);
        System.out.println(array.get(k-1));
    }
}
