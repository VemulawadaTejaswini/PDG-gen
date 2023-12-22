import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        String [] array = new String[n];
        for (int i = 0; i < n; i++) array[i] = in.next();
        List<String> list = new ArrayList<>();
        list.add(array[0]);
        char c = array[0].charAt(array[0].length()-1);
        for (int i = 1; i < n; i++){
            if (list.contains(array[i]) || array[i].charAt(0) != c){
                System.out.println("No");
                return;
            }
            c = array[i].charAt(array[i].length()-1);
            list.add(array[i]);
        }
        System.out.println("Yes");
    }
    
}