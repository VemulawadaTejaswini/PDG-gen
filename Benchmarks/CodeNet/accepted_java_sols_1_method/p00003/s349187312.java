import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n  = Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
            String st = br.readLine();
            String[] s = st.split(" ",0);
            int[] k = new int[3];
            k[0]=Integer.parseInt(s[0]);
            k[1]=Integer.parseInt(s[1]);
            k[2]=Integer.parseInt(s[2]);
            Arrays.sort(k);
            if(k[2]*k[2]==(k[1]*k[1])+(k[0]*k[0])){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            }
        }catch (Exception ex){
            System.exit(0);
        }
    }
}