import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        long[] num = new long[n];
        for(int i=0; i<n; i++){
            num[i] = Long.parseLong(str[i]);
        }
        int min = 0, max = 0;
        long sum = num[0];
        for(int i=1; i<n; i++){
            sum += num[i];
            if(num[i] < num[min]){
                min = i;
            }else if(num[i] > num[max]){
                max = i;
            }
        }
        sb.append(num[min]).append(" ").append(num[max]).append(" ").append(sum).append("\n");

        System.out.print(sb);



    }
}