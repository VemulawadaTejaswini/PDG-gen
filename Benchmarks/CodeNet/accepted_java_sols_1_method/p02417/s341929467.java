import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = new char[1200];
        int lsum = 0;
        String str;

        while((str = br.readLine()) != null){
           
            
            int l = str.length();
            

            for(int j=0; j<l; j++){
                c[j+lsum] = str.charAt(j);
            }

            lsum += l;
        }


        for(int i = 97; i<123; i++){
            char N = (char)i;
            int cou=0;
            for(int j=0; j<lsum; j++){
                if(c[j] == i || c[j] == i-32){
                    cou++;
                }
            }
            System.out.println(N + " : " + cou);
        }
       

    }
} 
