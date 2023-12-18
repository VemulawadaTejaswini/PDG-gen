import java.util.*;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[] c = sc.next().toCharArray();
        int[] map = new int[n+1];
        map[n] = n;
        for(int i=n-1; i>=0; i--) {
            if(c[i] == '0') {
                map[i] = i;
            } else {
                map[i] = map[i+1];
            }
        }
        List<Integer> path = new ArrayList<>();

        int pos = n;
        while(true) {
            if(pos <= m) {
                path.add(pos);
                break;
            }
            int npos = map[pos - m];
            if(npos == pos) {
                System.out.println(-1);
                return;
            }
            path.add(pos - npos);
            pos = npos;
        }

        int l = path.size();
        for(int i=l-1; i>=0; i--) {
            if(i < l-1) {
                System.out.print(" ");
            }
            System.out.print(path.get(i));
        }
        System.out.println();
    }


}
