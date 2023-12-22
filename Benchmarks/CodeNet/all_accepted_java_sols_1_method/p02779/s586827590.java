import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            hs.add(sc.nextInt());
        }

        String str = new String();
        if(hs.size() == n){
            str = "YES";
        } else{
            str = "NO";
        }

        System.out.println(str);
        sc.close();
    }
}