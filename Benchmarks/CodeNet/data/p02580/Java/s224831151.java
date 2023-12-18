import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static MyScanner scan;
    public static PrintWriter out;
    public static void main(String[] args) {
        scan=new MyScanner();
        out=new PrintWriter(new BufferedOutputStream(System.out));

        int t=1;
//        int t=scan.nextInt();
        while(t-->0) {

            int h=scan.nextInt(),w=scan.nextInt(),m=scan.nextInt();
            int[] row=new int[h],col=new int[w];
            int[][] points=new int[h][w];
            while(m-->0) {
                int r=scan.nextInt()-1,c=scan.nextInt()-1;
                points[r][c]++;
                row[r]++;
                col[c]++;
            }

            int maxX=0,maxY=0,ans=0;
            for(int c=1;c<h;c++) if(row[c]>row[maxX]) maxX=c;
            for(int c=1;c<w;c++) if(col[c]>col[maxY]) maxY=c;
            ArrayList<Integer> maxXX=new ArrayList<>(),maxYY=new ArrayList<>();
            ans+=row[maxX]+col[maxY]-1;
            for(int c=0;c<h;c++) if(row[c]==row[maxX]) maxXX.add(c);
            for(int c=0;c<w;c++) if(col[c]==col[maxY]) maxYY.add(c);

            o: for(int i=0;i<maxXX.size();i++) {
                for(int j=0;j<maxYY.size();j++) {
                    if(points[maxXX.get(i)][maxYY.get(j)]==0) {
                        ans++;
                        break o;
                    }
                }
            }
            out.println(ans);
        }
        out.close();
    }

    //scanner
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}