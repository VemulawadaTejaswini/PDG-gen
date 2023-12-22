import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int x,y,tmp;
        while(true){
        String str=buf.readLine();
        String[] yuu=str.split(" ");
        
        x=Integer.parseInt(yuu[0]);
        y=Integer.parseInt(yuu[1]);
        
        if(x==0 && y==0){
            break;
        }else if(x>y){
            tmp=x;
            x=y;
            y=tmp;
            }
        sb.append(x).append(" ").append(y).append("\n");
        }
        System.out.print(sb);
    }
}