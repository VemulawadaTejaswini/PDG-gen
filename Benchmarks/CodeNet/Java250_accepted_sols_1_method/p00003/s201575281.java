import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] data = new int[3];

        for(int i=0; i<count; i++){
            String[] str = br.readLine().split(" ");
            for(int k=0; k<3; k++){
                data[k] = Integer.parseInt(str[k]);
            }
            int maxIndex = 0;

            for(int k=1; k<3; k++){
                if(data[k]>data[maxIndex]){
                    maxIndex = k;
                }
            }
            //??\?????????
            int tmp = data[maxIndex];
            data[maxIndex] = data[0];
            data[0] = tmp;

            if(data[1] * data[1] + data[2] * data[2] == data[0] * data[0]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}