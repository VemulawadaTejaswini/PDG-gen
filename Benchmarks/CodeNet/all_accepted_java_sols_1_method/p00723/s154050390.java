import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
         
        int m = stdIn.nextInt();
        for(int i=0;i<m;i++){
            Set<String> s = new HashSet<String>();
            String a = stdIn.next();
            s.add(a);
            for(int j=1;j<a.length();j++){
                String b = a.substring(0, j);
                String c = a.substring(j);
                StringBuffer d = new StringBuffer(b);
                StringBuffer e = new StringBuffer(c);
                String f = d.reverse().toString();
                String g = e.reverse().toString();
                s.add(b.concat(c));
                s.add(b.concat(g));
                s.add(c.concat(b));
                s.add(c.concat(f));
                s.add(f.concat(g));
                s.add(g.concat(b));
                s.add(f.concat(c));
            }
            System.out.println(s.size());
        }
    }
}