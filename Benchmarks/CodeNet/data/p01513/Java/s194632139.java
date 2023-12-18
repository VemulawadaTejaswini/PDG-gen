import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();

            if(n == 0) break;

            TreeSet<Integer> member[] = new TreeSet[n+1];
            for(int i=1; i<=n; i++){
                member[i] = new TreeSet<Integer>();
                int m = sc.nextInt();
                for(int j=0; j<m; j++){
                    int p = sc.nextInt();
                    member[i].add(p);
                }
            }

            int k = sc.nextInt();
            TreeSet<Integer> outflow = new TreeSet<Integer>();
            for(int i=0; i<k; i++){
                int l = sc.nextInt();
                outflow.add(l);
            }

            int culprit = -1;
            for(int i=1; i<=n; i++){
                if(member[i].containsAll(outflow)){
                    if(culprit == -1){
                        culprit = i;
                    }
                    else{
                        culprit = -1;
                        break;
                    }
                }
            }
            System.out.println(culprit);
        }
    }
    public static void main(String[] args) {
        //new AOJ2399().run();
        new Main().run();
    }

}