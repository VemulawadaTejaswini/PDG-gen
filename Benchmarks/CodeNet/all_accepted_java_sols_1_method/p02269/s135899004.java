import java.util.*;

public class Main {
    public static void main(String[] args){
        HashMap <String, Boolean> dict = new HashMap <String, Boolean>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String dir = sc.next();
            if(dir.equals("insert")){
                String S = sc.next();
                dict.put(S, true);
            }else{
                String S = sc.next();
                if(dict.containsKey(S)){
                    System.out.printf("yes\n");
                }else{
                    System.out.printf("no\n");
                }
            }
        }
        sc.close();
    }
}
