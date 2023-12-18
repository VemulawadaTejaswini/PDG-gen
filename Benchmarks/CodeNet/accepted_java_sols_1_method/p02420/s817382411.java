import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = new char[200];
        char[] d = new char[200];

        while(true){
            String str = br.readLine();

            if(str.equals("-"))break;

            int l = str.length();

            for(int i=0; i<l; i++){
                c[i] = str.charAt(i);
            }

            String N = br.readLine();
            int num = Integer.parseInt(N);

            int nnum = 0;
            for(int i = 0; i<num; i++){
                nnum += Integer.parseInt(br.readLine());
            }

            int a = nnum % l;

            for(int i=0; i<l; i++){
                d[i] = c[(i+a)%l];
            }

            for(int i=0; i<l; i++){
                System.out.print(d[i]);
            }
            System.out.print("\n");
        }
    }
} 
