import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> dic = new HashSet<String>();

        String cmd;
        String str;
        int times = sc.nextInt();

        for(int i = 0; i < times; i++){
            cmd = sc.next();
            str = sc.next();

            if(cmd.equals("insert"))
                dic.add(str);

            if(cmd.equals("find")){
                if(dic.contains(str))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
        sc.close();
    }
}
