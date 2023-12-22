import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ring=br.readLine();
        String key=br.readLine();
        for(int i=0;i<ring.length();i++){
            if(ring.charAt(i)==key.charAt(0)){
                int root=i;
                int j=0;
                while(j<key.length()&&ring.charAt(root%ring.length())==key.charAt(j)){
                    j++;
                    root++;
                }if(j==key.length()){
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }System.out.println("No");
    }
}