import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            String s = scanner.next();
            set.add(s);
        }
        System.out.println(set.size());
    }
}
