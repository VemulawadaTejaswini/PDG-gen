import java.io.*;
   
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] R = new int[t];
        int i, j;
   
        R[0] = Integer.parseInt(br.readLine());
        int max = R[0];
        int min = R[0];
        int mint =0;
   
        for(i=1; i<t-1; i++){
            R[i] = Integer.parseInt(br.readLine());
            if(R[i] < min) {min = R[i]; mint=i; max=R[i];}
            else if(R[i] > max && i>mint) max=R[i];
        }
        if(min == R[t-2]) max = R[t-1];
        int bnf = max - min;
        System.out.println(bnf);
    }
}