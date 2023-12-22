import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
while(true){
String str = br.readLine();
int space = str.indexOf(" ");
String str1 = str.substring(0, space);
String str2 = str.substring(space+1, str.length());

int a = Integer.parseInt(str1);
int b = Integer.parseInt(str2);

if(a == 0 && b == 0)
 break;

for(int i = 0; i < a; i++){
 for(int j = 0; j < b; j++){
if(i == 0 || j == 0 || i == a-1 || j == b-1)
System.out.print("#");
else
System.out.print(".");
}
System.out.println();
}
System.out.println();
}
}}