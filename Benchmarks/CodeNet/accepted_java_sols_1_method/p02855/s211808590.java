import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       int h=s.nextInt(),w=s.nextInt(),k=s.nextInt();
       s.nextLine();
       int[][] arr=new int[h][w];
       int x=0,y=0;
       for(int i=0;i<h;i++){
        char[] c=s.nextLine().toCharArray();
        for(int j=0;j<w;j++){
          if(c[j]=='#'){
            arr[i][j]=-1; x=i;y=j;
          }
        }
       }
       int count=1;
       int[][] res=new int[h][w];
       for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          if(arr[i][j]==0||res[i][j]!=0){continue;}
          res[i][j]=count;
          int a=i-1,b=i+1;
          while(a>=0&&(arr[a][j]!=-1)&&res[a][j]==0){
            res[a][j]=count; a--;
          }
          while(b<h&&(arr[b][j]!=-1)&&res[b][j]==0){
            res[b][j]=count; b++;
          }
          count++;
        }
       }       

       int lc=y-1,rc=y+1;
       while(lc>=0){
        if(res[0][lc]!=0){lc--;continue;}
        for(int i=0;i<h;i++){
          res[i][lc]=res[i][lc+1];
        }
        lc--;
       }
       while(rc<w){
        if(res[0][rc]!=0){rc++;continue;}
        for(int i=0;i<h;i++){
          res[i][rc]=res[i][rc-1];
        }
        rc++;
       }
       BufferedWriter out =new BufferedWriter(new OutputStreamWriter(System.out));
       for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          out.write(res[i][j]+" ");
        }
        out.write("\n");
       out.flush();
       }
        }
    }
