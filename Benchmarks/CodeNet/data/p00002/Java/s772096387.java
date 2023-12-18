import java.util.Scanner;
class Main {
    public static void main (String args[]) {
        Scanner k = new Scanner (System.in);
        
        int i = k.nextInt();
        int j = k.nextInt();
        int l = i+j;
        
        String s = Integer.toString(l);
        
        System.out.println(s.length());
    }
}