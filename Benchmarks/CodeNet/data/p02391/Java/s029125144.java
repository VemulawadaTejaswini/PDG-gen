import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
public static void main(String[] args)throws IOException{
BufferedReader in = new BufferedReader(new InputStreamReader (System.in));
String[] ab = in.readLine().split(" ");

int a = integer.parseInt(ab[0]);
int b = integer.parseInt(ab[1]);

if(a>b){
System.out.println("a > b");
}else if(a<b){
System.out.println("a < b");
}else{
System.out.println("a == b");
}
}
}