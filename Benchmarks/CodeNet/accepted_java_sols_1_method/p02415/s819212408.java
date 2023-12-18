import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int len = line.length();
        char c[] = line.toCharArray();

        for(int i = 0; i < len; i++){
            
            if(c[i] >=65 && c[i]<= 90){
                c[i] = Character.toLowerCase(c[i]);
                System.out.print(c[i]);
            }else if(c[i]<=122&&c[i]>=97){
                c[i] = Character.toUpperCase(c[i]);
                System.out.print(c[i]);
            }else{
                System.out.print(c[i]);
            }
            
            if(i == len-1){
                System.out.print("\n");
            }
            
        }
        }
    }


