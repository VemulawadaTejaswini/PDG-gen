import java.io.*;
class Program{

}
class Main{
    public static void main(String[] args) throws IOException {
        Program obj = new Program();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String ip[];
        int N,M,C;
        int A[],B[];
        ip = in.readLine().split(" ");
        N = Integer.parseInt(ip[0]);
        M = Integer.parseInt(ip[1]);
        C = Integer.parseInt(ip[2]);
        int count = 0,score=0;
        A = new int[M]; B = new int[M];
        ip = in.readLine().split(" ");
            for(int i=0;i<M;i++) B[i] = Integer.parseInt(ip[i]);
        while(--N>=0){
            ip = in.readLine().split(" ");
            score = 0;
            for(int i=0;i<M;i++) {
                A[i] = Integer.parseInt(ip[i]);
                score+=B[i]*A[i];
            }
            if (score+C>0) count++;
        }
        System.out.println(count);
    }
}