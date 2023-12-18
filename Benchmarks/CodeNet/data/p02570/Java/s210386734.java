import java.io.*;

class Main{
    
    public static void main(String[] args)throws IOException{
        
        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
         
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        double D = Integer.parseInt(str1);
        double T = Integer.parseInt(str2);
        double S = Integer.parseInt(str3);
        
        if((D/S)<=T){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}