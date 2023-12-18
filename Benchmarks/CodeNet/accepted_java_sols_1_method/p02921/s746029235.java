import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        String S = scan.nextLine();
        char[] Schar = S.toCharArray();
        String T = scan.nextLine();
        char[] Tchar = T.toCharArray();
        int weather = 0;
        for(int i = 0 ; i < Schar.length ; i++){
            if(Schar[i] == Tchar[i]){
                weather++;
            }
        }
        System.out.println(weather);
    }
}
