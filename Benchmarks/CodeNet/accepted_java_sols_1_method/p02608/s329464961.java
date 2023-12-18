import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        int[] arr = new int[10001];
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                for(int k=1;k<=100;k++){

                    int num = i*i + j*j + k*k + i*j + i*k + j*k;
                    if(num > 10000)break;
                    else{
                        arr[num]++;
                    }
                }
            }
        }

        for(int i=1;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}
