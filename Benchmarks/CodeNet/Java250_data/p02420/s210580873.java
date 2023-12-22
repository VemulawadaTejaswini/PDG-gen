import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = new String();
        String line2,line3;
        String cut,rem;
        String result = new String();
outer:
        while(true){

                line=reader.readLine();
                if(line.equals("-")){
                    break outer;
                }
                int len = line.length();
            
            line2 = reader.readLine();
            int m = Integer.parseInt(line2);
            result = line;
            for(int j = 0;j < m;j++){
                
                line3 = reader.readLine();
                int h = Integer.parseInt(line3);
                cut = result.substring(h);
                rem = result.substring(0,h);
                result = cut+rem;
                }

            
            System.out.println(result);
        }
        }
    }



