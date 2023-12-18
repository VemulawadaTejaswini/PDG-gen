import java.io.*; import java.util.*;
public class Main {
    static int N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        char[][] c=new char[N][M];
        for (int i = 0; i < N; i++) {
            String s=br.readLine();
            for (int j = 0; j < M; j++) {
                c[i][j]=s.charAt(j);
            }
        }
        int ans=0; TreeSet<Integer> ts=new TreeSet<>();
        
        for (int i = N-1; i >=0; i--) {
            for (int j = M-1; j >=0; j--) {
                if(c[i][j]=='o'){
                    ts=new TreeSet<>();
                    int k=move(i,j,c,ts);
                    //System.out.println(i+" "+j+" "+k);
                    c[i][j]='.';
                    c[k/M][k%M]='o';
                    ans+=(k/M+k%M-i-j);
                }
            }
        }
        System.out.println(ans);
    }
    public static int move(int i, int j, char[][] c, TreeSet<Integer> arl){
        //Returns the final point, distance can be computed easily
        //System.out.println(i+" "+j);
        if((i==N-1 || c[i+1][j]!='.')&& (j==M-1 || c[i][j+1]!='.')){
            return M*i+j;
        }
        int dist=0; int l=0;
        if(i<N-1 && c[i+1][j]=='.' && !arl.contains(M*(i+1)+j)){
            arl.add(M*(i+1)+j);
            l=move(i+1,j,c,arl);
            dist=(l/M-i)+(l%M-j);
        }
        int k=0;
        if(j<M-1 && c[i][j+1]=='.' && !arl.contains(M*i+j+1)){
            arl.add(M*i+j+1);
            k=move(i,j+1,c,arl);
        }
        if((k/M-i)+(k%M-j)>dist){
                
                return k;
        }else{
                return l;
        }
        
    }
}
