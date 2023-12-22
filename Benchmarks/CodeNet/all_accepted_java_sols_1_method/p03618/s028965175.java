import java.util.Scanner;

/**
 *
 * @author mustafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        String alphabet = "qwertyuopasdfghjklizxcvbnm";
        int[] c = new int[26];
        
        for (int i = 0; i < alphabet.length(); ++i)
        {
            for (int j = 0; j < s.length(); ++j)
            {
                if (alphabet.charAt(i) == s.charAt(j))
                {
                    c[i]++;
                }
            }
        }
        
        long t = 0;
        
        for (int i = 0; i < c.length; ++i)
        {
            t += c[i];
        }
        
        long toplam = 0;
        
        for (int i = 0; i < c.length; ++i)
        {
            if (t - c[i] == 0)
                toplam += 1;
            else
                toplam += c[i] * (t - c[i]);
        }
        
        System.out.print((long)toplam/2 + 1);
        
//        long sayac = 1;
//        
//        for (int i = 0; i < s.length() - 1; ++i)
//        {
//            for (int j = i + 1; j < s.length(); ++j)
//            {
//                if (s.charAt(i) == s.charAt(j))
//                    continue;
//                else
//                    sayac++;
//            }
//        }
//        
//        System.out.println(sayac);
    }
    
}