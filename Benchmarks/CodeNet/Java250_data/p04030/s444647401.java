import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        sc.close();

        List<Character> str = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0')
                str.add('0');
            else if(s.charAt(i) == '1')
                str.add('1');
            else{
                if(str.size() != 0)
                    str.remove(str.size()-1);
            }
        }
        for(int i = 0; i < str.size(); i++){
            System.out.print(str.get(i));
        }
    }
}