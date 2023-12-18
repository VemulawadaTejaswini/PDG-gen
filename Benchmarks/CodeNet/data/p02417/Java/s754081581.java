import java.io.*;

public class Main {
    public static void main(String[] args){
        int i;
        int Alphabet[]=new int[26];
        try {
            while ((i=System.in.read())!=-1) {
                if(i=='\n')break;
                if('a'<=i&&i<='z')i-='a';
                else if('A'<=i&&i<='Z')i-='A';
                else continue;
                Alphabet[i]++;
                //System.out.println(i);
            }
        }catch(IOException e){
            System.err.println("IOException"+e);
        }

        for(int j=0;j<26;j++){
            System.out.println((char)(j+'a')+" : "+Alphabet[j]);
        }
    }
}

