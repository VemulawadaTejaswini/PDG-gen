import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.math.BigInteger;
import java.math.BigDecimal;
       
public class Main{
   
static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static final long LINF=Long.MAX_VALUE/2;
static int MAX=1500;
static char[] str=new char[MAX+1];
   
public static void main(String[] args) throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(in));
  out.println("??????");
  int n=Integer.parseInt(br.readLine());
  while(n-->0){
    String line=br.readLine();
    int cur=0;
    Arrays.fill(str,'-');
    for(int i=0;i<line.length();i++) str[i]=line.charAt(i);
    int m=Integer.parseInt(br.readLine());
    while(m-->0){
      String com0=line.split(" ")[0];
      String com1=line.split(" ")[1];
      if("forward".equals(com0)){
        if("char".equals(com1)){
          if(str[cur]!='-') cur++;
        }
        else if("word".equals(com1)){
          while(str[cur]==' ') cur++;
          while(str[cur]!=' '&&str[cur]!='-') cur++;
        }
      }
      else if("backward".equals(com0)){
        if("char".equals(com1)){
          if(cur>0) cur--;
        }
        else if("word".equals(com1)){
          while(cur>0&&str[cur-1]==' ') cur--;
          while(cur>0&&str[cur-1]!=' ') cur--;
        }
      }
      else if("insert".equals(com0)){
        String insertionStr=line.substring(8,line.length()-1);
        for(int i=MAX-insertionStr.length();i>=cur;i--){
          if(str[i]!='-') str[i+insertionStr.length()]=str[i];
        }
        for(int i=0;i<insertionStr.length();i++){
          str[cur+i]=insertionStr.charAt(i);
        }
        cur+=insertionStr.length();
      }
      else if("delete".equals(com0)){
        if("char".equals(com1)){
          if(str[cur]!='-'){
            for(int i=cur;;i++){
              if(str[i]=='-') break;
              str[i]=str[i+1];
            }
          }
        }
        else if("word".equals(com1)){
          int cnt=cur;
          while(str[cnt]==' ') cnt++;
          if(str[cnt]!='-'){
            while(str[cnt]!=' '&&str[cnt]!='-') cnt++;
            for(int i=cur;;i++){
              if(str[i]=='-') break;
              str[i]=str[i-cur+cnt];
            }
          }
        }
      }
    }
    StringBuilder sb=new StringBuilder();
    for(int i=0;;i++){
      if(i==cur) sb.append("^");
      if(str[i]=='-') break;
      sb.append(String.valueOf(str[i]));
    }
    out.println(sb);
    out.flush();
  }
}
}