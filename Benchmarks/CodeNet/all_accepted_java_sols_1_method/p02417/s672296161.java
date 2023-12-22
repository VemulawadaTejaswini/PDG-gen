import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader stdln = new BufferedReader(new InputStreamReader(System.in));
        int[] count= new int[26];
        String st;
        
        while((st=stdln.readLine())!=null){
        for(char c:st.toCharArray()){
            c|=0x20;
            if(c>='a'&&c<='z')count[c-'a']++;
            }
        }
        for(int i=0;i<26;i++){
        System.out.printf("%c : %d\n",'a'+i,count[i]);
        }
    }
}
