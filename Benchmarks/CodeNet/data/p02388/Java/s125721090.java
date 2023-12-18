import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int a = Integer.ParseInt(br.readLine());
System.out.println(a*a*a);
}
}