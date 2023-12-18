import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final ArrayList<vec> mat = new ArrayList<vec>();
        for(int i = 0; i<n; i++){
            final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j<i; j++){
                final int len = Integer.parseInt(st.nextToken());
                if(len!=-1) mat.add(new vec(len, j, i));
            }
        }
        mat.sort(null);
        final int[] group = new int[n];
        int cost = 0;
        for(int i = 0; i<n; i++)
            group[i] = i;
        for(int i = 0, m = mat.size(); i<m; i++){
            if(group[mat.get(i).f]==group[mat.get(i).t]) continue;
            cost += mat.get(i).l;
            final int f = group[mat.get(i).f];
            final int t = group[mat.get(i).t];
            for(int j = 0; j<n; j++)
                if(group[j]==t) group[j] = f;
        }
        System.out.println(cost);
    }
}

class vec implements Comparable<vec>{
    final int l;
    final int f;
    final int t;
    vec(int len, int from, int to){
        l = len;
        f = from;
        t = to;
    }
    @Override
    public int compareTo(vec other){
        return l-other.l;
    }

}