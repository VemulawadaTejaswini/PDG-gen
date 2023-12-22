import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        List<String> str= new ArrayList<>();
        str.add(sc.next());
        for (int index = 1; index < num; index ++) {
            String tmp = sc.next();
            if(str.contains(tmp) || !tmp.substring(0,1).equals(str.get(index-1).substring(str.get(index-1).length()-1))){
                 System.out.println("No");
                 System.exit(0);
            }
            str.add(tmp);
        }
        System.out.println("Yes");
    }
}