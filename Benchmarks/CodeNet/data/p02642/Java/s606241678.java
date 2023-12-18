import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        boolean d = false;
        for(int i = 0; i < n; i++){
            ArrayList<Integer> aa = (ArrayList<Integer>) a.clone();
            a.add(scan.nextInt());
            if(aa.contains(a.get(i)) && !d){
                d = true;
            }
        }
        Collections.sort(a);
        int out = n;
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(a.get(i) % a.get(j) == 0 && i != j){
                    out--;
                    break;
                }
            }
        }
        System.out.println(d ? out - 1 : out);
        scan.close();
    }
}