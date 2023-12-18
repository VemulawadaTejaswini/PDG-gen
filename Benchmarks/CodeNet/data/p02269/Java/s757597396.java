import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String order, str;
        ArrayList<String> s = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            order = sc.next();
            str = sc.next();

            if(order.equals("insert")) s.add(str);

            if(order.equals("find")){
                for(int j = 0; j < s.size(); j++){
                    if(str.equals(s.get(j))){
                        System.out.println("yes");
                        break;
                    }
                    if(j == s.size() - 1) System.out.println("no");
                }
            }
        }
        sc.close();
    }
}
