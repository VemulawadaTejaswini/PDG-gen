import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(buf.readLine());
        int[] h=new int[num];
        String[] str=buf.readLine().split(" ");
        
        for(int i=0;i<num;i++){
            h[i]=Integer.parseInt(str[i]);
        }
        
        int cnt=0;
        for(int i=0;i<h.length-1;i++){
            for(int j=h.length-1;j>i;j--){
                if(h[j-1]>h[j]){
                    int tmp=h[j];
                    h[j]=h[j-1];
                    h[j-1]=tmp;
                    cnt=cnt+1;
                }
            }
        }
        System.out.print(h[0]);
        for(int i=1;i<h.length;i++){
            System.out.print(" "+h[i]);
        }
        System.out.println();
        System.out.println(cnt);
    }
}