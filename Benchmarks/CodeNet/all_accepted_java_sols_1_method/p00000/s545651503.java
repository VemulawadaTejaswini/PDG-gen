import java.io.*;

class Main{
    public static void main(String[] a){
        StringBuffer sb = new StringBuffer(1024);
        for(int i=1; i<=9; i++)
            for(int j=1; j<=9; j++)
                sb.append(i).append("x").append(j).append("=").append(i*j).append("\n");
        System.out.print(sb);
    }
}