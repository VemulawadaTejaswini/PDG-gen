import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int t = Integer.parseInt(in[2]);
        int r=0;
        for(int i=1;i<=t;i++){
            if(i % a == 0){
                r++;
            }
        }
        System.out.println(r*b);
    }
}