import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long ans = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String s = scanner.next();
            char sa[] = s.toCharArray(); 
            Arrays.sort(sa);
            String sorted = new String(sa);
            ans += map.getOrDefault(sorted, 0);
            map.put(sorted, map.getOrDefault(sorted, 0)+1);
        }
        System.out.println(ans);
    }
}

