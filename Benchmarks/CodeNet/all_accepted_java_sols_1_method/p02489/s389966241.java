import java.io.*;
 
class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i>0; i++)
        {
            int num = Integer.parseInt(in.readLine());
            if(num==0)
                break;
            System.out.println("Case "+ i + ": " + num);
        }
 
    }
}