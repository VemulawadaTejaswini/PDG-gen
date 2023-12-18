import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        ArrayList<ArrayList<Integer>> mass = new ArrayList<ArrayList<Integer>>();
        if (N%2==0) {
            for (int i=0;i<N/2;i++) {
                ArrayList<Integer> add = new ArrayList<Integer>();
                add.add(i+1);
                add.add(N-i);
                mass.add(add);
            }
        } else { // N%2==1
            int N_tmp = N-1;
            for (int i=0;i<N_tmp/2;i++) {
                ArrayList<Integer> add = new ArrayList<Integer>();
                add.add(i+1);
                add.add(N_tmp-i);
                mass.add(add);
            }
            ArrayList<Integer> add_tmp = new ArrayList<Integer>();
            add_tmp.add(N);
            mass.add(add_tmp);
        }

        if (N%2==0) {
            System.out.println(4*(N/2)*(N/2-1)/2);
        } else { // N%2==1
            System.out.println(4*((N-1)/2)*((N-1)/2-1)/2+(N-1));
        }
        for (int i=0;i<mass.size();i++) {
            ArrayList<Integer> tmp = mass.get(i);
            for (int j=0;j<tmp.size();j++) {
                for (int k=i+1;k<mass.size();k++) {
                    if (i==k) continue;
                    ArrayList<Integer> tmp_2 = mass.get(k);
                    for (int l=0;l<tmp_2.size();l++) {
                        System.out.println(tmp.get(j)+" "+tmp_2.get(l));
                    }
                }
            }
        }
    }
}