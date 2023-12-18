import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s;
        s = scan.nextLine();
        String t = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) <= 'Z' && s.charAt(i) >= 'A'){
                t += (char)(s.charAt(i) -'A' + 'a');
            }
            else if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a'){
                t += (char)(s.charAt(i) + 'A' - 'a');
            }
            else t += s.charAt(i);
        }
        System.out.println(t);
    }
}

