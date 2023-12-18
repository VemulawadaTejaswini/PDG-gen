import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] NQ = new int[2];
        int cont = 0;
        for (String s:str.split(" ")){
            NQ[cont] = Integer.parseInt(s);
            cont++;
        }
        String S = br.readLine();
        String[] s = S.split("");
        int[] cumulative_sum = new int[NQ[0]+1];
        cont = 0;
        for (int i=1;i<NQ[0];i++){
            if (s[i].equals("C") && s[i-1].equals("A")){
                cont += 1;
            }
            cumulative_sum[i+1] = cont;
        }
        int[] lr = new int[2];
        for (int i=0;i<NQ[1];i++){
            str = br.readLine();
            cont = 0;
            for (String t:str.split(" ")){
                lr[cont] = Integer.parseInt(t);
                cont++;
            }
            System.out.println(cumulative_sum[lr[1]]-cumulative_sum[lr[0]]);
        }
    }
}