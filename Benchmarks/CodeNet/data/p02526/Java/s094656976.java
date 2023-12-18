


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            int ns[] = new int[n];
            String line = br.readLine(); String splited[] = line.split(" ");
            for(int i=0; i<n;i++){
                ns[i]=Integer.parseInt(splited[i]);
            }
            int q = Integer.parseInt(br.readLine());
            int qs[] = new int[q]; line = br.readLine(); splited=line.split(" ");
            for(int i=0; i<q;i++){
                qs[i]=Integer.parseInt(splited[i]);
            }
            int c = count(qs,ns);
            System.out.println(c);
        }catch(Exception e){e.printStackTrace();}
    }
    static int count(int[] ns, int[] qs){
        int count=0;
        for(int i = 0; i<ns.length; i++){
            int n_i = ns[i];
            for(int j=0; j<qs.length; j++){
                if(n_i==qs[j]){count++; break;}
            }
        }
        return count;
    }
}