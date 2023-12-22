import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        int min=10; int idx = 0;
        for(int i=0;i<5;++i)
        {
            arr[i] = Integer.parseInt(br.readLine());
            if( ( arr[i]%10!=0) &&(arr[i]%10<min)) {idx=i; min=arr[i]%10;}
        }
        int sum =0;
        for(int i=0;i<5;++i)
        {
            if(i==idx)continue;
            sum+=arr[i];
            while(sum%10!=0) sum++;
        }
        sum+=arr[idx];
        bw.write(sum+"");
        bw.close();

    }
}
