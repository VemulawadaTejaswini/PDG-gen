import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        int sum = 0;

        while(true){
            str = br.readLine();

            if(str.equals("0"))break;
            
            for(int i=0; i<str.length(); i++){
                sum += Integer.parseInt(str.substring(i,i+1));
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}