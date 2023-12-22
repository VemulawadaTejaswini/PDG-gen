import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, Long> count = new HashMap<>(); 
        for(int i=0;i<N;i++){
            String s = scanner.next();
            List<Character> charlist = new ArrayList<>();
            for(int j=0; j<s.length(); j++){
                charlist.add(s.charAt(j));
            }
            Collections.sort(charlist);
            s = String.valueOf(Arrays.asList(charlist));
            count.computeIfPresent(s, (key, val) -> val+1);
            count.putIfAbsent(s, Long.valueOf(1));
        }
        long result = 0;
        for(long n:count.values()){
            result += n*(n-1)/2;
        }
        System.out.println(result);
    }
}