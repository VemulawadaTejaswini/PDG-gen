import java.io.*;
class Main{
public static void main(String args[]){
try{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
int x = Integer.parseInt(str);
}
catch(Exception e){}
System.out.println(x*x*x);
}
}