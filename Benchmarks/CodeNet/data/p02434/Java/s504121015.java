import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        ArrayList<ArrayList<Integer>> L = new ArrayList<>();
        for(int i=0;i<n;i++)L.add(new ArrayList<Integer>());
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            int t = sc.nextInt();
            if(cmd==0){
                int x = sc.nextInt();
                L.get(t).add(x);
            }
            else if(cmd==1) {
                if(L.get(t).size()==0) System.out.print("");
                else{
                    System.out.print(L.get(t).get(0));
                    for(int j=1;j<L.get(t).size();j++) System.out.print(" "+L.get(t).get(j));
                }
                System.out.println();
            }
            else L.get(t).clear();
        }
    }
}
