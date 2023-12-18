import java.io.*;
import java.util.*;

public class Main {

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tok;

        public InputReader(InputStream inputStream) {
            reader = new BufferedReader(new InputStreamReader(inputStream));
            tok = null;
        }

        public InputReader(String inputFile) throws FileNotFoundException {
            reader = new BufferedReader(new FileReader(inputFile));
            tok = null;
        }

        public String nextLine() {
            String c = "";
            try {
                c = reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            return c;
        }

        public String next() {
            while (tok == null || !tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(nextLine());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }

    public static void main(String args[]) {
        InputStream inputstream = System.in;
        OutputStream outputstream = System.out;
        InputReader in = new InputReader(inputstream);
        PrintWriter out = new PrintWriter(outputstream);
        Task solver = new Task();
        solver.solve(in, out);
        out.flush();
    }

    static class Task {
        public void solve(InputReader in, PrintWriter out) {
            int rows=in.nextInt();
            int cols=in.nextInt();
            int bombs=in.nextInt();
            boolean[][] grid=new boolean[rows][cols];
            for(int i=0;i<bombs;i++){
                int x=in.nextInt();
                int y=in.nextInt();
                grid[x-1][y-1]=true;
            }
            int[] rowMax=new int[rows];
            int[] colMax=new int[cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(grid[i][j]){
                        rowMax[i]++;
                        colMax[j]++;
                    }
                }
            }
           /*  long ans=0;
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    int a;
                    if(grid[i][j])
                    a=rowMax[i]+colMax[j]-1;
                    else
                    a=rowMax[i]+colMax[j];
                    if(a>ans)
                    ans=a;
                    if(ans>(rows+cols-1))
                    break;
                }
                if(ans>(rows+cols-1))
                    break;
            } */
            int maxX=0,maxY=00;
            for(int a:rowMax)
            if(a>maxX) maxX=a;
            for(int a:colMax)
            if(a>maxY) maxY=a;
            List<Integer> Xindex=new ArrayList<>();
            List<Integer> Yindex=new ArrayList<>();
            for(int i=0;i<rows;i++){
                if(rowMax[i]==maxX)
                Xindex.add(i);
            }
            for(int i=0;i<cols;i++)
            if(colMax[i]==maxY)
            Yindex.add(i);
            long ans=0;
            for(int i=0;i<Xindex.size();i++){
                for(int j=0;j<Yindex.size();j++){
                    int a;
                    if(grid[Xindex.get(i)][Yindex.get(j)])
                    a=rowMax[Xindex.get(i)]+colMax[Yindex.get(j)]-1;
                    else
                    a=rowMax[Xindex.get(i)]+colMax[Yindex.get(j)];
                    if(a>ans)
                    ans=a;
                    if(ans>(rows+cols-1))
                    break;
                }
                if(ans>(rows+cols-1))
                    break;
            }
            out.println(ans);
        }
    }
}