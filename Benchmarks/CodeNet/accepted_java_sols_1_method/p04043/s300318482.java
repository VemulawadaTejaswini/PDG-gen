import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());    
        int B = Integer.parseInt(st.nextToken());    
        int C = Integer.parseInt(st.nextToken());
        int five=0,sev=0;
        if(A==5)
            five++;
        else
            sev++;
        if(B==5)
            five++;
        else
            sev++;
        if(C==5)
            five++;
        else
            sev++;

        if(sev==1 && five==2)
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}

//10 3 10 3