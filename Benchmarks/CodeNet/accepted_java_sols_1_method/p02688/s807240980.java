import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> sunukes = new HashSet<>();
        for(int i=1;i<=k;i++){
            int d =sc.nextInt();
            for(int j=1;j<=d;j++){
                int sunuke = sc.nextInt();
                sunukes.add(sunuke);
            }
        }

        System.out.println(n-sunukes.size());

    }
}
