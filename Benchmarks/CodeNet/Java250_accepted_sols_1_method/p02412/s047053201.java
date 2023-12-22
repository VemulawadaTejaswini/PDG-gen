import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int count = 0;
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int x = Integer.parseInt(str[1]);

            if(n == 0 && x == 0)break;
            for(int i=1; i<=n; i++){
                for(int k=1; k<=n; k++){
                    for(int w=1; w<=n; w++){
                        if(i!=k && k!=w && i!=w && (i+k+w) == x)count++;
                    }
                }
            }
            System.out.println(count / 6);
        }
    }
}