
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), n = sc.nextInt();
        boolean[] p = new boolean[102];
        for(int i=0;i<n;i++){
            p[sc.nextInt()] = true;
        }
        for(int i=0;i<100;i++){
            if(!p[x - i]){
                System.out.println(x-i);
                break;
            }else if(!p[x + i]){
                System.out.println(x+i);
                break;
            }
        }
    }
}
