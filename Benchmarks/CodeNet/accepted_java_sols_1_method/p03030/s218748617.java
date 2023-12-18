import java.util.*;
import static java.util.Comparator.*;
class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();        
        String[] s = new String[n];
        for(int i = 0; i < n ; i++)
            s[i] = (stdIn.next() + "_" + (1100 - stdIn.nextInt()) + "_" + (i +1));
        Arrays.sort(s);
        for(String i: s)
            System.out.println(i.split("_")[2]);
   }
}
