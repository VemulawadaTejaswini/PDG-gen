import java.io.*;
public class Main{
   public static void main(String[] args)throws IOException{
InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

while(true){
String str = br.readLine();

int space1 = str.indexOf(" ");
int space2 = str.indexOf(" ", space1+1);
String str1 = str.substring(0, space1);
String str2 = str.substring(space1+1, space2);
String str3 = str.substring(space2+1, str.length());
int a = Integer.parseInt(str1);
int b = Integer.parseInt(str2);
int c = Integer.parseInt(str3);

if(a == -1 && b == -1 && c == -1)
break;
else if(a == -1 || b == -1)
 System.out.println("F");
else if(a + b >= 80)
 System.out.println("A");
else if(a + b >= 65)
 System.out.println("B");
else if(a + b >= 50)
 System.out.println("C");
else if(a + b >= 30)
 if(c >= 50)
  System.out.println("C");
 else
  System.out.println("D");
else
 System.out.println("F");

}
}
}