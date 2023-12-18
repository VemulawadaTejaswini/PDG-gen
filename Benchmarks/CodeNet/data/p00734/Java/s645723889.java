import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,m;
        while((n = scan.nextInt()) != 0 && (m = scan.nextInt()) != 0){
            ArrayList<Integer> tarou = new ArrayList<Integer>();
            ArrayList<Integer> hanako = new ArrayList<Integer>();
            int t_total = 0, h_total = 0, t_result = 100, h_result = 100;

            for(int i=0; i<n; i++){
                int s = scan.nextInt();
                tarou.add(s);
                t_total += s;
            }
            for(int i=0; i<m; i++){
                int s = scan.nextInt();
                hanako.add(s);
                h_total += s;
            }

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    int t = t_total;
                    int h = h_total;
                    t = t - tarou.get(j) + hanako.get(i);
                    h = h - hanako.get(i) + tarou.get(j);
                    if(t == h && tarou.get(j)+hanako.get(i) < t_result+h_result){
                        t_result = tarou.get(j);
                        h_result = hanako.get(i);
                    }
                }
            }

            if(t_result == 100 && h_result == 100){
                System.out.println(-1);
            } else{
                System.out.println(t_result + " " + h_result);
            }
        }
    }
}