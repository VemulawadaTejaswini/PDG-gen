import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] c = new char[1200];
        String str;

        //while((str = br.readLine()) != null){
            str = br.readLine();
            int l = str.length();

            for(int i = 0; i<l; i++){
                c[i] = str.charAt(i);
                
                if(c[i] >=65 && c[i] <= 90){
                    c[i] += 32;
                }else if(c[i] >= 97 && c[i] <=122){
                    c[i] -= 32;
                }
                System.out.print(c[i]);
            }
           System.out.print("\n");
            
       // }
   
    }
}
