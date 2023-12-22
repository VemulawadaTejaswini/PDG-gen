import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();
        
        String[] array1 = line1.split(" ");
        String[] array2 = line2.split(" ");
        
        String s = array1[0];
        String t = array1[1];
        String u = line3;
        
        int a = Integer.parseInt(array2[0]);
        int b = Integer.parseInt(array2[1]);
        
        if(s.equals(u))
        {
            a--;
        }
        else
        {
            b--;
        }
        
        System.out.println(a + " " + b);
    }
}
