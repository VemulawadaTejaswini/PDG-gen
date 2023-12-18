import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");
        long sum=0;
        int max=-1000000, min=1000000, tmp=0;
        for(int i=0;i<n;i++){
            tmp=Integer.parseInt(str2[i]);
            if(tmp>max)max=tmp;
            if(tmp<min)min=tmp;
            sum=sum+tmp;
        }
        System.out.println(min+" "+max+" "+sum);
    }
}