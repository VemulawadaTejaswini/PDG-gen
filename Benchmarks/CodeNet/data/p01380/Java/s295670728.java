import java.util.*;

public class Main{

    int n;
    int[][] ab;

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        ab = new int[n][2];
        for(int i=0; i<n; i++){
            ab[i][0] = sc.nextInt();
            ab[i][1] = sc.nextInt();
        }

        Arrays.sort(ab, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[1] - b[1];
                }
            });

        PriorityQueue<int[]> 
            q = new PriorityQueue<int[]>(n, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return b[1] - a[1];
                    }
                });

        int sum = 0;
        for(int i=0; i<n; i++){
            q.add(ab[i]);
            sum += ab[i][0];
            if(sum>ab[i][1]){
                int[] remove = q.poll();
                sum -= remove[0];
            }
        }

        System.out.println(q.size());
    }

    public static void main(String[] args){
        new Main().solve();
    }
}