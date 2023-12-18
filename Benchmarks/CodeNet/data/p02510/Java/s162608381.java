import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

while(true){
String str = br.readLine();
if(str.equals("-"))
 break;

String str_n = br.readLine();
int n = Integer.parseInt(str_n);

for(int i = 0; i < n; i++){
String shu = br.readLine();
int s = Integer.parseInt(shu);

str += str.substring(0, s);
str = str.substring(s);

}
System.out.println(str);
}

}
}