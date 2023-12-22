import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> dict = new HashSet<String>();
        for(int i = 0;i<n;i++){
            String s = sc.next();
            String str = sc.next();
            if(s.equals("insert")) {
                dict.add(str);
            }
            else if(dict.contains(str)){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}
