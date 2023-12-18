import java.util.*;
import java.util.stream.*;
class Main {
    private static String CaseReverse (String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isUpperCase(c)){
                c += 32;
                sb.append(c);
            } else if (Character.isLowerCase(c)){
                c -= 32;
                sb.append(c);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        str = CaseReverse(str);
        System.out.println(str);
    }
}
