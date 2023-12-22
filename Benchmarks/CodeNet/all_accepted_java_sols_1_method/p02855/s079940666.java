import java.io.*;
import java.util.*;

public class Main{
    static public void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int H =sc.nextInt(), W = sc.nextInt(), K = sc.nextInt();
        int firstLine = 10000;
        ArrayList<Integer>[] rec = new ArrayList[H];
        for(int i=0;i<H;i++) rec[i] = new ArrayList<>();
        for(int i=0;i<H;i++){
            char[] line = sc.next().toCharArray();
            for(int j=0;j<W;j++){
                if(line[j]=='#') rec[i].add(j);
            }
            if(rec[i].size()>0) firstLine = Math.min(firstLine,i);
        }
        int[][] ans = new int[H][W];
        int curNum = 0;
        for(int i=firstLine; i<H;i++){
            if(rec[i].size()==0){
                for(int j=0;j<W;j++) ans[i][j] = ans[i-1][j];
            } else{
                // do the left of the first one
                int curIdx = 0, size = rec[i].size();
                for(int j=rec[i].get(0);j<W;j++){
                    if(curIdx>=size || j != rec[i].get(curIdx)) ans[i][j] = curNum;
                    else{
                        curNum += 1;
                        curIdx += 1;
                        ans[i][j] = curNum;
                    }
                }
                for(int j=rec[i].get(0)-1; j>=0; j--) ans[i][j] = ans[i][j+1];
            }
        }
        // finally do the top part
        for(int i=firstLine-1; i>=0;i--){
            for(int j=0;j<W;j++) ans[i][j] = ans[i+1][j];
        }
        PrintWriter out = new PrintWriter(System.out);
       for(int i=0;i<H;i++){
            for(int j=0;j<W;j++) out.print(ans[i][j]+" ");
            out.print("\n");
        }
        out.flush();
    }
}

