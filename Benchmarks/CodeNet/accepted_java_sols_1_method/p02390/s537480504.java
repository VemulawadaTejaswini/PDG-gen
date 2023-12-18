import java.io.*;
class Main{
    public static void main(String[]args){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      	int S;
        try{
            S = Integer.parseInt(bf.readLine());
        }catch(Exception e){
          	S = 0;
        }
        int H,M,s;
        H = (int) S / 3600;
        M = (int) (S%3600) / 60;
        s = (int) (S%3600) % 60;
        System.out.print(H + ":");
        System.out.print(M + ":" + s);
        System.out.println();
    }
}
