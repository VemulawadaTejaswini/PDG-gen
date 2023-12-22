import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int h = scan.nextInt();
        int w = scan.nextInt();
        
        String[] pict = new String[h];
        for(int i=0;i<pict.length;i++)
        {
            pict[i] = scan.next();
        }
        
        for(int i=0;i<pict.length;i++)
        {
            System.out.println(pict[i]);
            System.out.println(pict[i]);
        }
    }
}
