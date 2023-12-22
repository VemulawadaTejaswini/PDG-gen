import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] ACTG = {"A","C","T","G"};
        String[] TGAC = {"T","G","A","C"};
        for (int i=0;i<4;i++){
            if (str.equals(ACTG[i])){
                System.out.println(TGAC[i]);
            }
        }
    }
}