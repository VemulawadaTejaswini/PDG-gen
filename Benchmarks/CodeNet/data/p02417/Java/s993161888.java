import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));     
        String str;
                    
                    char[] alpha = {'a','b','c','d','e','f','g','h','i','j','K','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
                    int[] counts = new int[26];

                    while((str = br.readLine()) != null){
                        String temp = str.toLowerCase();
                        char[] temp2 = temp.toCharArray();

                        for(int i=0;i<temp2.length;i++){
                            for(int j=0;j<26;j++){
                                if(temp2[i] == alpha[j]){
                                    counts[j] += 1;
                                }        
                            }
                        }
                    }

                    br.close();
                    StringBuilder sb = new StringBuilder();
                    for(int i =0;i<26;i++){
                        sb.append(String.valueOf(alpha[i]));
                        sb.append(" : ");
                        sb.append(String.valueOf(counts[i]));
                        if(i== 25){
                            break;
                        }
                        sb.append("\n");
                    }
              
                    System.out.println(sb.toString());
    }
}