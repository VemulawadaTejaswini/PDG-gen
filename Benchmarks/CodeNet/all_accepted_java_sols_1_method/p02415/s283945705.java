import java.io.*;


public class Main{
    
    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            char[] word = new char[line.length()];
            int [] num = new int[line.length()];
            for(int i = 0; i < line.length(); i++){
                word[i] = line.charAt(i);
                num[i] = Integer.valueOf(word[i]);
                if(num[i] <= 90 && num[i] >= 65){
                    num[i] = num[i] + 32;
                }else if(num[i] <= 122 && num[i] >= 97){
                    num[i] = num[i] - 32;
                }
                word[i] = (char)num[i];
                System.out.print(word[i]);
            }
            System.out.println();    
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
