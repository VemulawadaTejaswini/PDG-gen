import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        List<Integer> X = new ArrayList<Integer>();
        List<Integer> Y = new ArrayList<Integer>();
        int count = 0;
        int x;
        int y;
        int max;
        int opp;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n!=0) {
                if (count % 2 == 0) {
                    X.add(n);
                } else {
                    Y.add(n);
                }
                count++;
            } else {
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> H = new ArrayList<>();
        ArrayList<Integer> W = new ArrayList<>();
        for(int i=0;i<X.size();i++){
            x = X.get(i);
            y = Y.get(i);
            max = (int) Math.floor(Math.sqrt(x*x+y*y));

            for (int j=1; j<=max/2; j++){
                opp = (int) Math.ceil(Math.sqrt(x*x+y*y-j*j+1));
                list.add(j*j+opp*opp);
                System.out.println(j);
                System.out.println(opp);

            }
            System.out.println(list);
            int h = list.indexOf(Collections.min(list))+1;
            int w = (int) Math.ceil(Math.sqrt(x*x+y*y-h*h+1));
            H.add(h);
            W.add(w);
        }
        for(int i=0;i<H.size();i++) {
            System.out.println(H.get(i)+" "+W.get(i));
        }
    }
}

