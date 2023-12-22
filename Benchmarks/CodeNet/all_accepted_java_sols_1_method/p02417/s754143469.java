import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] alp = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Character> clist = new ArrayList<Character>();
        for(char each : alp){
            clist.add(each);
        }
        int[] count = new int[26];
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(c >= 'A' && c <= 'Z'){
                    c += 'a' - 'A';
                    int index = clist.indexOf(c);
                    count[index]++;
                }else if(c >= 'a' && c <= 'z'){
                    int index = clist.indexOf(c);
                    count[index]++;
                }
            }
        }
        for(int i = 0; i < 26; i++){
            System.out.println(clist.get(i) + " : " + count[i]);
        }
    }
}
