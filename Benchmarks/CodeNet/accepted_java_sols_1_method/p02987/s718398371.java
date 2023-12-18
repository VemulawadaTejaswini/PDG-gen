
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Set<Character> set = new HashSet<>();
        for(char ch: s.toCharArray() ){
            set.add(ch);
        }
        if(set.size()==2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
