import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
                    
                    String[] temp = str.split("\\s");
                    
                    int r = Integer.parseInt(temp[0]);
                    int c = Integer.parseInt(temp[1]);
                    int[][] inp = new int[r][c];
                    
                    

                    for(int i=0;i<r;i++){
                        str = br.readLine();
                        String[] line = str.split("\\s");
                            for(int j=0; j<c; j++){
                                int x = Integer.parseInt(line[j]);
                                inp[i][j]= x;
                            }
                    }

                    
                    int[] ve = new int[c];
                    for(int k=0; k<c ; k++){
                        str = br.readLine();
                        String[] strs = str.split("\\s");
                        ve[k] = Integer.parseInt(strs[0]);
                        //System.out.println(ve[k]);
                    }
                    
                    for(int i=0;i<r;i++){
                        int ans =0;
                        int atemp = 0;
                        for(int j =0;j<c;j++){
                         atemp = inp[i][j] * ve[j];
                         ans += atemp;  
                        }
                        System.out.println(ans);
                    }
                        br.close();
    }
}