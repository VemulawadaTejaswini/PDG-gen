import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
public static void main(String [] args) throws Exception{
BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
while(true){
String str = reader.readLine(); 
String array[]=new String[3];
array = str.split(" ");
int x = Integer.parseInt(array[0]);
int y = Integer.parseInt(array[2]);
String op = array[1];

if (op.equals("?")){
break;
}else if(op.equals("+")){
System.out.println(x+y);

}else if(op.equals("-")){
System.out.println(x-y);

}else if(op.equals("*")){
System.out.println(x*y);

}else if(op.equals("/")){
System.out.println(x/y);
}
}