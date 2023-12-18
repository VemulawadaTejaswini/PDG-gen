import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextInt();
        double k = s.nextInt();
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(s.nextInt());
        }
        double an=(n-1)/(k-1);
        System.out.print((int)Math.ceil(an));
    }
}