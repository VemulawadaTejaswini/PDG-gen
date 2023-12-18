import java.io.*;
class Main{
public static void main(String[] args){
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
try{
String s = input.readLine();
int x=Interger.parseInt(s);
System.out.println(Math.pow(x,3));
}catch(IOExceptin e){}
}
}