import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            if(set.contains(m)){
                set.remove(m);
            }else {
                set.add(m);
            }
        }
        System.out.println(set.size());
    }
}