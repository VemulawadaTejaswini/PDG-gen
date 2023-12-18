import java.io.*;
public class Main {
public static void main(String[] args)throws IOException{
BufferedReader br=
new BufferedReader(new InputStreamReader(System.in));
int a = Integer.parseInt(br.readLine());

if(a == 1){
System.out.println("Hello World");
} 
if(a == 2){
int b = Integer.parseInt(br.readLine());
int c = Integer.parseInt(br.readLine());
System.out.println(b + c);
}
}
}
