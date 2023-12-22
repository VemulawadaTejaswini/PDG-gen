import java.io.*;

class Main{
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
          
        String line = r.readLine();    
        String[] w = line.split(" ",0);
        int ret[]={0,0,0};
        ret[0]=Integer.parseInt(w[0]);
        ret[1]=Integer.parseInt(w[1]);
        ret[2]=Integer.parseInt(w[2]);
        
        int buf = 0;
        for (int j=0;j<=2-1 ;j++){
            for (int i =2;i>j;i--){
                if(ret[i] < ret[i-1]) {
                    buf = ret[i-1];
                    ret[i-1]=ret[i];
                    ret[i]=buf;
                }
            }
        }      
        System.out.println(ret[0]+" "+ret[1]+" "+ret[2]);
        r.close();
    }
}