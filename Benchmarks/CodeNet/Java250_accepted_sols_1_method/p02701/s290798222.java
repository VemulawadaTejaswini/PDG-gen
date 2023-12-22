import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hs=new HashSet<String>();
        int N=Integer.parseInt(br.readLine());
        int count=0;
        for(int i=0;i<N;i++){
            String str=br.readLine();
            boolean added=hs.add(str);
            if(added) count++;
        }
        System.out.println(count);
    }
}
