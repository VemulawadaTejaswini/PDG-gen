import java.io.*;

class Main{
    public static void main(String[] args)[
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String[] S = br.readLine().spilt(" ", 0);
        int x = Integer.parseInt(S[0]);
        int y = Integer.parseInt(S[1]);
        int i

        if(x<=y){
            i = y%x;
            while(i!=0){
                y = x;
                x = i;
                i = y%x;
            }
            System.out.println(x);
        }else{
            i = x%y;
            while(i!=0){
                x = y;
                y = i;
                i = x%y;
            }
            System.out.println(y);
        }
    }
}