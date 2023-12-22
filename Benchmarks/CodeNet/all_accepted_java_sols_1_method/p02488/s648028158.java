import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
String str = br.readLine();
int n = Integer.parseInt(str);
if(n != 0)
str = br.readLine();

for(int i = 0; i < n-1; i++){
String pre = br.readLine();
 if(str.compareTo(pre) > 0)
  str = pre.toString();
}
if(n != 0)
System.out.println(str);

}
}