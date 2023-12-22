import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(scan.nextInt());
        }
        ArrayList<Integer> aa = new ArrayList<>(new HashSet<>(a));
        if(aa.size() == n){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}