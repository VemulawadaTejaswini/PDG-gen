import java.io.*;

public class Main {
    public static void main(String[] arg){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        try{
            String x;
            x =reader.readLine();
            while(x != null){
                for(int i = 0; i<x.length(); i++){
                    char a = x.charAt(i);
                    for(int j = 0; j < str1.length(); j++){
                        char b = str1.charAt(j);
                        char c = str2.charAt(j);
                        if(a == b){
                            a = c;
                        }else if(a == c){
                            a = b;
                        }
                    }
                    System.out.print(a);
                }
                System.out.println();
                x = reader.readLine();
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
