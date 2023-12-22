import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();  
        int A = r.i();
        int B = r.i();
        int C = r.i();
        int X = r.i();
        int ans = 0;
        for(int a = 0; a <= A; a++){
            for(int b = 0; b <= B; b++){
                for(int c = 0; c <= C; c++){
                    int sum = a*500+b*100+c*50;
                    if(sum == X)
                        ans++;
                }
            }
        }        
        println(ans);
    }
    static void print(Object o){
        System.out.print(o.toString());
    }
    static void println(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return s().split(" ");
        }
        int Int(String s){
            return Integer.parseInt(s);
        }
        int i() throws IOException{
            return Int(s());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }
    }
}