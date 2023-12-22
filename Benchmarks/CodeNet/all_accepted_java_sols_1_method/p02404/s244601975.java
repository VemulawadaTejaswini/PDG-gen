import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
    	//  W <= 300
    	String sh = "##############################################################################################################################################################################################################################################################################################################";
    	String dt = "..............................................................................................................................................................................................................................................................................................................";
        String u, nl = System.getProperty("line.separator");
        StringBuilder
            p = new StringBuilder(1000),
            k = new StringBuilder(100);
        Scanner r = new Scanner(System.in);
        int h, w;
        while (0 != ((h = r.nextInt()) | (w = r.nextInt()))) {
            p.append(u = sh.substring(0, w)).append(nl);
            k.setLength(0);
            k.append(dt.substring(0, w)).append(nl)
            .replace(0, 1, "#").replace(w - 1, w, "#");
            while (2 != h--) {
                p.append(k);
            }
            p.append(u).append(nl).append(nl);
        }
        System.out.print(p);
    }
}