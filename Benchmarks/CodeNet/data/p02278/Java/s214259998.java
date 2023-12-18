import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final Bug[] A = new Bug[n];
        final boolean[] found = new boolean[n];
        final StringTokenizer in = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++)
            A[i] = new Bug(Integer.parseInt(in.nextToken()), i);
        Arrays.sort(A);
        int cost = 0;
        final int min = A[0].weight;
        for(int i = 0; i<n; i++){
            if(found[i]) continue;
            found[i] = true;
            int m = 0;
            for(int j = A[i].index; j!=i; j = A[j].index){
                found[j] = true;
                cost += A[j].weight;
                m++;
            }
            cost += Math.min(A[i].weight*m, min*(m+2)+A[i].weight*2);
        }
        System.out.println(cost);
    }
}

class Bug implements Comparable<Bug>{
    final int weight;
    final int index;
    Bug(int weight, int index){
        this.weight = weight;
        this.index = index;
    }
    @Override
    public int compareTo(Bug o){
        if(weight<o.weight) return -1;
        else if(weight>o.weight) return 1;
        else return 0;
    }
}