import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = " abcdefghijklmnopqrstuvwxyz";
        int i;
        long n,amari;
        String name = "";
        String ans="";

        n = sc.nextLong();
        
        if (n % 26 == 0) {
            while (n != 1) {
                n /= 26;
                name += 'z';
            }
        }
        else {
            while (n > 26) {
                amari = n % 26L;
                n /= 26;
                //System.out.printf("---------------\na=%d\nn=%d\n", amari, n);
                if (amari == 0) {
                    name += 'z';
                } else {
                    name += str.charAt((int) amari);
                }
            }
            name += str.charAt((int)n);
        }
        int len = name.length();

        for (i = 0; i < len; i++) {
            ans += name.charAt(len - 1 - i);
        }
        System.out.println(ans);
    }

}