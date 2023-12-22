import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            char[] c = sc.nextLine().toCharArray();
            if(c[0] == '-') break;
            int t = 0;
            int m = sc.nextInt();
            for(int i = 0;i < m;++i) t += sc.nextInt();
            for(int i = 0,l = c.length;i < l;++i) System.out.print(c[(t + i) % l]);
            System.out.println();
            sc.nextLine();
        }
    }

}