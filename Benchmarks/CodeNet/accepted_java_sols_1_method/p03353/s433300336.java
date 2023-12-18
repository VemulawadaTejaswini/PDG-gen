import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int K = sc.nextInt();
        sc.close();
        List<String> ans = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j <=K; j++){
                if(i+j > s.length()) break;
                if(!ans.contains(s.substring(i, i+j))) ans.add(s.substring(i, i+j));
            }
        }
        Collections.sort(ans);
        if(ans.size() < K)System.out.println(ans.get(ans.size()-1));
        else System.out.println(ans.get(K-1));
    }

}
