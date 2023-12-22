import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] num = new int[count];
        for(int i=0; i<count; i++){
            num[i] = Integer.parseInt(str[i]);
        }

        for(int i=0; i < count/2; i++){
            int k = count - (i+1);
            int swp = num[i];
            num[i] = num[k];
            num[k] = swp;
        }
        for(int i=0; i<count-1; i++){
            sb.append(num[i]).append(" ");
        }
        sb.append(num[count-1]);
        System.out.println(sb);

    }
}