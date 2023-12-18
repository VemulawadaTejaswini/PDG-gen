import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        FastReader fs = new FastReader();
        out = new PrintWriter(new BufferedOutputStream(System.out));

       int r = fs.nextInt();
        int c = fs.nextInt();
        int m = fs.nextInt();

        int[] row = new int[r+1];
        int[] col = new int[c+1];

        Map<Integer,Set<Integer>> rMap = new HashMap<>();
        Map<Integer,Set<Integer>> cMap = new HashMap<>();

        int rowMax = 0 ;
        int colMax = 0 ;

        for(int i=0 ; i<m ; i++){
            int x = fs.nextInt();
            int y = fs.nextInt();
            row[x]++;
            col[y]++;

            if(rMap.containsKey(x)){
                Set<Integer> set = rMap.get(x);
                set.add(y);
                rMap.put(x,set);
                rowMax = Math.max(rowMax,set.size());
            }else{
                Set<Integer> set = new HashSet<>();
                set.add(y);
                rMap.put(x,set);
                rowMax = Math.max(rowMax,set.size());
            }

            if(cMap.containsKey(y)){
                Set<Integer> set = cMap.get(y);
                set.add(x);
                cMap.put(y,set);
                colMax = Math.max(colMax,set.size());
            }else{
                Set<Integer> set = new HashSet<>();
                set.add(x);
                cMap.put(y,set);
                colMax = Math.max(colMax,set.size());
            }

        }

        ArrayList<Integer> rowMaxs = new ArrayList<>();
        ArrayList<Integer> colMaxs = new ArrayList<>();

        for(int i=1 ; i<=r ; i++){
            if(row[i]==rowMax){
                rowMaxs.add(i);
            }
        }

        for(int i=1 ; i<=c ; i++){
            if(col[i]==colMax){
                colMaxs.add(i);
            }
        }


        boolean breakOuter = false ;

        for(int i =0 ; i<rowMaxs.size() ; i++){
            if(breakOuter){
                break;
            }
            int ra = rowMaxs.get(i);
            for(int j=0 ; j<colMaxs.size() ; j++){
                int ca = colMaxs.get(j);

                if(rMap.containsKey(ra)){
                    Set<Integer> neigh = rMap.get(ra);
                    if(!neigh.contains(ca)){
                        breakOuter = true;
                    }
                }

            }
        }

        if(breakOuter){
            out.println(rowMax+colMax);
        }else{
            out.println(rowMax+colMax-1);
        }
        
        out.close();

    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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
    //--------------------------------------------------------
}

