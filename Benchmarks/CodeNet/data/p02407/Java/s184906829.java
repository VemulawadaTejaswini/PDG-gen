import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbu=new StringBuilder();
        int x=Integer.parseInt(buf.readLine());
        String[] num=buf.readLine().split(" ");
            for(int i=x-1;0<=i;i--){
                sbu.append(num[i]+" ");
                }
            int y=sbu.length();
            sbu.deleteCharAt(y-1);
            System.out.println(sbu);
            }
        }