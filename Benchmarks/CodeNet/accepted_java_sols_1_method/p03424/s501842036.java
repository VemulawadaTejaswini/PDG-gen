import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i = 0; i < n; i++) set.add(sc.next().charAt(0));
        
        String res = "";
        
        switch(set.size()){
            case 3:
                res = "Three";
                break;
            case 4:
                res = "Four";
        }
        
        System.out.println(res);
    }
}
