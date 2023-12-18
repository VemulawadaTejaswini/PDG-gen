import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long list[] = {0,0,0,0,0};
        for(int x=1;x<=n;x++) {
            String first = sc.next();
            String top = first.substring(0,1);
            if(top.equals("M")) {
                list[0] += 1;
            }
            if(top.equals("A")) {
                list[1] += 1;
            }
            if(top.equals("R")) {
                list[2] += 1;
            }
            if(top.equals("C")) {
                list[3] += 1;
            }
            if(top.equals("H")) {
                list[4] += 1;
            }
        }
        System.out.println(list[0]*list[1]*list[2]+list[0]*list[1]*list[3]+list[0]*list[1]*list[4]+list[0]*list[2]*list[3]+list[0]*list[2]*list[4]+list[0]*list[3]*list[4]+list[1]*list[2]*list[3]+list[1]*list[2]*list[4]+list[1]*list[3]*list[4]+list[2]*list[3]*list[4]);
    }
}
