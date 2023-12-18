import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int[] a = new int[5];
        for(int i=0; i<5; i++){
            a[i] = Integer.parseInt(str[i]);
        }
        if( (a[4] <= a[2]) && (a[2] <= (a[0] - a[4])) ){
            if( (a[4] <= a[3]) && (a[3] <= (a[1] - a[4])) ){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}