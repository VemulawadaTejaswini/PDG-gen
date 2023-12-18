import java.util.Scanner;
 
class Main {
    Scanner sc = new Scanner(System.in);
 
    int[] count = new int[26];
 
    public void run() {
        while(sc.hasNext()){
            String str = sc.nextLine();
            str=str.toLowerCase();
            char[] c = str.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if ('a' <= c[i] && c[i] <= 'z')
                    count[c[i] - 'a']++;
            }
        }
        for (int i = 0; i < count.length; i++) {
            ln(((char) (i + 'a')) + " : " + count[i]);
        }
    }
 
    public static void main(String[] args) {
        new Main().run();
    }
 
    public static void pr(Object o) {
        System.out.print(o);
    }
 
    public static void ln(Object o) {
        System.out.println(o);
    }
 
    public static void ln() {
        System.out.println();
    }
}
