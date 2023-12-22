import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<Character>  ary = new ArrayList<Character>();
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i < str.length(); ++i){
            ary.add(str.charAt(i));
        }
        Collections.sort(ary);
        if(ary.get(0) == ary.get(1) && ary.get(2) == ary.get(3) && ary.get(0) != ary.get(2)) {
            System.out.print("Yes");
        } else  {
            System.out.print("No");
        }
     }
}