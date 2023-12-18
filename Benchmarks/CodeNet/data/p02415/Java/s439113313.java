import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char charArray[] = str.toCharArray();
        
        for(int i=0; i<charArray.length; i++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }else{
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println(charArray);
    }
}