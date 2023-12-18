
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
public static void main(String[] args){
 
try{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 String buf = buf.readLine();

 StringTokenizer st = new StringTokenizer(buf," ");
 int a = Integer.parseInt(st.nextToken());
 int b = Integer.parseInt(st.nextToken());
 int c = Integer.parseInt(st.nextToken());
 
 if(a < b && b < c){
  System.out.println("Yes");
} else{
 System.out.println("No");
} 
}catch(IOExeption e){
 System.out.println("error");
}
}}