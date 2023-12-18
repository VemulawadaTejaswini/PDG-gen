import java.io.*;
import java.util.Arrays;
class Main{
    public static void main(String[] args) throws IOException {
        int i,n,taro=0,hanako=0; 
        String[] str = new String[200];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        for(i=0;i<n;i++){
            str = in.readLine().split(" ",-1);
            if(str[0].compareToIgnoreCase(str[1])>0) taro+=3;
            if(str[0].compareToIgnoreCase(str[1])<0) hanako+=3;
            else if(str[0].compareToIgnoreCase(str[1])==0){
                taro+=1;
                hanako+=1;
            }
        }
        System.out.println(taro+" "+hanako);
        System.out.flush();
    }
}