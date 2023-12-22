import java.util.*;
import java.text.*;

class Main {
    public static void main(String[]args)throws Exception {
        Scanner sc = new Scanner(System.in);
        char [] cs = sc.nextLine().toCharArray();
        for(int i = 0; i < cs.length; i++) {
            if(cs[i] >= 'A' && cs[i] <= 'Z') cs[i] = (char)(cs[i] + 0x20);
            else if(cs[i] >= 'a' && cs[i] <= 'z') cs[i] = (char)(cs[i] - 0x20);
        }
        System.out.println(new String(cs));
    }
}