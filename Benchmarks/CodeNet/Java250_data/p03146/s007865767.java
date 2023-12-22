import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int s = Integer.parseInt(sc.next());
        
        Set<Integer> set = new HashSet();
        
        int count = 1;
        set.add(s);
        while(true){
            count++;
            if(s%2 == 0){
                s = s/2;
                if(set.contains(s)){
                    break;
                }
                set.add(s);
            }else{
                s = s*3+1;
                if(set.contains(s)){
                    break;
                }
                set.add(s);
            }
        }
        
        System.out.println(count);
    }
}