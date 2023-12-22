import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Set<Integer> moti = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            if(!moti.contains(d)){
                moti.add(d);
            }
        }

        System.out.println(moti.size());   
    }
}