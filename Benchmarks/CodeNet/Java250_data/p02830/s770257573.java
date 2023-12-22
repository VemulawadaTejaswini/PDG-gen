import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        for(int i =0;i<n;i++){
            System.out.print(s[i]);
            System.out.print(t[i]);

        }
    }
}