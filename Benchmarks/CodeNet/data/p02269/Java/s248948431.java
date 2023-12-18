import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> dict = new HashSet<String>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            String str = sc.next();
            if(command.equals("insert")){
                dict.add(str);
            }else if(command.equals("find")){
                if(dict.contains(str)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }

        sc.close();
    }
}
