import java.io.*;

class Main{
public static void main(String[] args) throws IOException {

 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
 int area; 
 int areaLength;
 
 int a = Integer.parseInt(br.readLine());
 int b = Integer.parseInt(br.readLine());
  
  area = a * b;
  areaLength = ( a + b ) * 2;
 System.out.println(a * b);
 System.out.println(" ");
 System.out.println(2*a+2*b);



}

}