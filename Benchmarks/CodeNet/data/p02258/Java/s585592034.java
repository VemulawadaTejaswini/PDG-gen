import java.io.*;
            
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] R = new int[t];
        int i, j;
            
        for(i=0; i<t; i++) R[i] = Integer.parseInt(br.readLine());
        int max = R[0];
        int min = R[0];
        int bnf, a;
        bnf = max - min;
            
        for(i=0; i<t-1; i++){
            for(j=i+1; j<t; j++){
                a = R[j] - R[i];
                if(bnf < a) bnf = a;
            }
        }
             
        System.out.println(bnf);
    }
}