import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean[] aaaaa = new boolean[scan.nextInt()];
        Arrays.fill(aaaaa,false);
        int k = scan.nextInt();
        for(;k>0;k--){
            int d = scan.nextInt();
            for(;d>0;d--){
                aaaaa[scan.nextInt()-1] = true;
            }
        }
        int aa = 0;
        for(boolean b:aaaaa){
            if(!b)aa++;
        }
        System.out.println(aa);
    }
}