import java.io.*;

public class Main{

    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alfa = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                        'n','o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int[] counter = new int[26];
        String str;

        while((str = br.readLine()) != null){

            //?°????????????±?????????????§£
            str = str.toLowerCase();
            char[] strArray = str.toCharArray();

            for(int i=0; i<strArray.length; i++){
                for(int k=0; k<26; k++){
                    if(alfa[k] == strArray[i]) counter[k]++;
                }
            }
        }
        //??????
        for(int i=0; i<26; i++){
            System.out.println(alfa[i] +" : "+ counter[i]);
        }
    }   
}