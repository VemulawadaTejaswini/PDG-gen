import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String[] array = N.split("");
        int calc = 0;
        int[] num = new int[array.length];
        for(int i = 0;i<array.length;i++){
            num[i] = Integer.parseInt(array[i]);
            calc += num[i];
        }
        int Nn;
        Nn = Integer.parseInt(N);
        if(Nn%calc == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}