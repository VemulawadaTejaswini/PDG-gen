import java.util.Scanner;

 

public class Main {

 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;
        w: while (true) {
            s1 = sc.next();
            if (".".equals(s1)) {
                break;
            }
            s2 = sc.next();

 

            if (s1.equals(s2)) {
                System.out.println("IDENTICAL");
                continue;
            }
            s1 = s1.replaceAll("\"", "@");
            s2= s2.replaceAll("\"", "@");
            int count = 0;
            while(s1.contains("@")) {
                if(!s2.contains("@")) {
                    System.out.println("DIFFERENT");
                    continue w;
                }
                int first1 = s1.indexOf("@", 0);
                int second1 = s1.indexOf("@", first1+1);
                
                int first2 = s2.indexOf("@", 0);
                int second2 = s2.indexOf("@", first2+1);
                
                String p1 = s1.substring(first1, second1+1);
                String p2 = s2.substring(first2, second2+1);
                
                if(p1.equals(p2)) {
                    s1 = s1.replaceFirst(p1, "*");
                    s2 = s2.replaceFirst(p1, "*");
                } else {
                    count ++;
                    s1 = s1.replaceFirst(p1, "*");
                    s2 = s2.replaceFirst(p2, "*");
                }
            }
            for (int i = 0; i < Math.max(s1.length(),s2.length()); i++) {
                try {
                if(s1.charAt(i) != s2.charAt(i)) {
                    System.out.println("DIFFERENT");
                    continue w;
                }
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println("DIFFERENT");
                    continue w;
                }
                
            }
            System.out.println(count == 1 ? "CLOSE":"DIFFERENT");
        }
        sc.close();
    }

 

}
