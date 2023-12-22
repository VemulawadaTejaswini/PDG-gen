import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        String s = scanner.next();
        int k = scanner.nextInt();
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j <= k; j++){
                if(i+j <= s.length()){
                    set.add(s.substring(i,i+j));
                }
            }
        }
        int count = 1;
        for(String cur : set){
            if(count == k){
                System.out.println(cur);
            }
            count++;
        }
    }
}
