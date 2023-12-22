import java.util.*;
import java.io.*;

public class Main{
public static void main(String[] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String[] ABT = br.readLine().split(" ");
int A = Integer.parseInt(ABT[0]);
int B = Integer.parseInt(ABT[1]);
int T = Integer.parseInt(ABT[2]);
System.out.println((T/A)*B);
}
}
