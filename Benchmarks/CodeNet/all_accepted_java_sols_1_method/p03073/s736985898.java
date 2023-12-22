import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int a = s.length();
        int[] b = new int[a];
        int[] c = new int[a];
        int[] d = new int[a];
        int bb = a;
        int cc = a;
        for(int i = 0 ; i < a ; i++ ){
            b[i] = i % 2;
            c[i] = (i + 1) % 2;
            d[i] = s.charAt(i) - 48;
            if(b[i] == d[i]){
                bb--;
            }
            if(c[i] == d[i]){
                cc--;
            }
        }
        if(bb > cc){
            System.out.println(cc);
        }else{
            System.out.println(bb);
        }
    }
}