import java.io.*;
import java.lang.*;

class Main{
public static void main(String[] args) throws Exception{
int x, ans;
BufferedReader br = new BufferedReader(new InputStreamReader(System.io));
x = Integer.parseInt(br.readLine());
ans = (int)Math.pow(x, 3);
System.out.println(ans);
}
}