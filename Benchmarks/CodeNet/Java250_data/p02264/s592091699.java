import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void solve(){
        Scanner scan = new Scanner(System.in);
        int n, q, i, t;
        String[] names = new String[100001];
        int[] times = new int[100001];
        Queue<Integer> processList = new LinkedList<>();
        n = scan.nextInt();
        q = scan.nextInt();
        
        for(i=0;i<n;i++){
            names[i] = scan.next();
            times[i] = scan.nextInt();
            processList.add(i);
        }
        t = 0;
        while(!processList.isEmpty()){
            int x = processList.remove();
            if(times[x]> q){
                times[x] -= q;
                t+=q;
                processList.add(x);
            }else if(times[x] == q){
                t+=q;
                System.out.println(names[x] + " " + t);
            }else{
                t += times[x];
                System.out.println(names[x] + " " + t);
            }
        }
    }
    
    public static void main(String[] args) {
        solve();
    }
}

