import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbu=new StringBuilder();
        
        while(true){
            String[] num=buf.readLine().split(" ");
            int x=Integer.parseInt(num[0]);
            int y=Integer.parseInt(num[1]);
            
            if(x == 0 && y == 0)break;
            
            for(int i=0; i<x; i++){
                for(int j=0; j<y; j++){
                    sbu.append("#");
                }
                sbu.append("\n");
            }
            sbu.append("\n");
        }
        System.out.print(sbu);
    }
}