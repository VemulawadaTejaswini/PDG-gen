import java.util.*;
import java.io.*;
public class Main{
public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       StringBuilder sb=new StringBuilder();
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=s.nextInt();
        int[][] cij=new int[10][10];
        for(int i=1;i<=n;i++){
        	sb.append(i);
        	cij[sb.charAt(0)-'0'][sb.charAt(sb.length()-1)-'0']++;
        	sb=new StringBuilder();
        }
        long res=0;
        for(int i=0;i<=9;i++){
        	for(int j=0;j<=9;j++){
        		res+=(long)cij[i][j]*cij[j][i];
        	}
        }
       out.write(res+"");
        out.flush();
  }
}
