import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        String[] t = new String[1000];
        int num = 0;
        while(true){
            t = br.readLine().split(" ");
            for(int i=0; i<t.length; i++){
                if(t[i] == w){
                    num++;
                }
                else if(t[i] == "END-OF-FILE"){
                    System.out.println(num);
                    System.exit(0);
                }
            }
        }
    }
}