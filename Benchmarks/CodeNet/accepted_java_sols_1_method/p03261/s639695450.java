import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0;i < n;++i){
            String s = sc.next();
            if(b.size() > 0){
                String s1 = b.get(b.size() - 1);
                if(s1.charAt(s1.length() - 1) != s.charAt(0)){
                    System.out.println("No");
                    return;
                }
            }
            if(b.contains(s)){
                System.out.println("No");
                return;
            }
            b.add(s);
        }
        System.out.println("Yes");
    }

}


