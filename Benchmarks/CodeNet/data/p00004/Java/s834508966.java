import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            double array[] =new double[6];
            for(int j=0;j<array.length;j++) array[j]=Integer.parseInt(st.nextToken());
            double y=(array[0]*array[5]-array[2]*array[3])/(array[0]*array[4]-array[1]*array[3]);
            double x=(array[2]*array[4]-array[1]*array[5])/(array[0]*array[4]-array[1]*array[3]);
            if(x==-0.0) x=0.0;
            if(y==-0.0) y=0.0;
            System.out.printf("%.3f %.3f\n",x,y);
            }catch(Exception e){
                System.out.println(e);
                System.exit(0);
            };
        }
    }
    
}