import java.util.*;

class Main{
    static int mod = 1000000000+7;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> keihin = new HashSet<>();
        for(int i=0;i<n;i++){
            keihin.add(sc.next());
        }

        System.out.println(keihin.size());
    }
}
