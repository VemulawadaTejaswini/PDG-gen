import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb=new StringBuilder();
        int a=Integer.parseInt(buf.readLine());
        int[] h=new int[a];
        String[] str=buf.readLine().split(" ");
        
        for(int i=0;i<h.length;i++){
            h[i]=Integer.parseInt(str[i]);
        }
        Sert(h,a);
    }
        
public static void Sert(int[] h,int a){
        int v,j;
        for(int i=0;i<h.length;i++){
             v=h[i];
             j=i-1;
             while(j>=0 && h[j]>v){
                 h[j+1]=h[j];
                 j--;
             }
             h[j+1]=v;
             toArray(h);
        }
    }

public static void toArray(int[] h){
    StringBuilder sbu=new StringBuilder();
    for(int i=0;i<h.length;i++){
      sbu.append(h[i]); 
      if(i<h.length-1)sbu.append(" ");
    }
    System.out.println(sbu);
    }
}