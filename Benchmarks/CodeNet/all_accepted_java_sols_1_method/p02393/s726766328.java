import java.io.*;
import java.util.*;

public class Main {
public static void main(String[] args)throws IOException{

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine();
String[]abc =str.split(" ");
int a =Integer.parseInt(abc[0]);
int b =Integer.parseInt(abc[1]);
int c = Integer.parseInt(abc[2]);

Arrays.sort(abc);

System.out.println(abc[0]+" "+abc[1]+" "+abc[2]);
}
}