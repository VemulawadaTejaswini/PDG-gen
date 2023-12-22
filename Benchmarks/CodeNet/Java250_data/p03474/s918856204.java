import java.lang.reflect.Array;
import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        Character[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        List<Character> numList = Arrays.asList(numbers);
        String ans = "Yes";
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(i == a){
                if(c != '-'){
                    ans = "No";
                    break;
                }
            }else if(!numList.contains(c)){
                ans = "No";
                break;
            }
        }

        System.out.println(ans);
    }
}