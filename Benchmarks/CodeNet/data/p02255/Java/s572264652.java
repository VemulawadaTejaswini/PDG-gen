import java.io.*;
       
public class Main {
    public static void main(String[] args) throws IOException{
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int n = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ", 0);
        int i, j;
        String v;
                
        System.out.println(String.join(" ", A));
  
        for(i=1; i<n; i++){
            v = A[i];
            j = i - 1;
            while(j>=0 && Integer.parseInt(v)<Integer.parseInt(A[j])){
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = v;
            System.out.println(String.join(" ", A));
        }
    }
}