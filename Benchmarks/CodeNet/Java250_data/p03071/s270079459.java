import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        int b = Integer.parseInt(in[1]);
        int r=0;
        for(int i=0;i<2;i++){
            if(a > b){
                r+=a;
                a--;
            }else{
                r+=b;
                b--;
            }
        }
        System.out.println(r);
    }
}