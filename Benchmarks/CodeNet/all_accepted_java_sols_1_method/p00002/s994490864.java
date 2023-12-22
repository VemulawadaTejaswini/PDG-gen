import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        while(true){
            try{
                StringTokenizer st=new StringTokenizer(str," ");
                int sum=Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
                System.out.println(String.valueOf(sum).length());
                str=br.readLine();
            }catch(Exception e){System.exit(0);}
        }
    }
    
}