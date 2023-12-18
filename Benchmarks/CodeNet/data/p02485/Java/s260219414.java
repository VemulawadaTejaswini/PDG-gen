import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
int[] arr = new int[1000];
while(true){
int ans = 0;
String str = br.readLine();
if(str.equals("0")
 break;
for(int i = 0; i < str.length(); i++){
 ans += str.charAt(i) - '0';
}
System.out.println(ans);
}
}
}