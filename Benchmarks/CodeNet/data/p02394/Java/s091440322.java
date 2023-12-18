import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args)throws IOException{

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine();
String[]abc =str.split(" ");
int  W=Integer.parseInt(abc[0]);
int H =Integer.parseInt(abc[1]);
int x = Integer.parseInt(abc[2]);
int y = Integer.parseInt(abc[2]);
int r = Integer.parseInt(abc[2]);

if( x-r<0 || y-r<0 || x+r>W || y+r>H ){
System.out.println("No");
}else{
System.out.println("Yes");
}
}
}