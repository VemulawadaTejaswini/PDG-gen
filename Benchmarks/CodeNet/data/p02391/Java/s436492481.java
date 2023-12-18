import java.io.*;

public class {
public static void main(String args[])throws IOException{
int a,b;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.print("A=");
a=Integer.parseInt(br.readLine());
System.out.print("B=");
b=Integer.parseInt(br.readLine());

if(a>b){
System.out.printIn("A>B");
}

if(b<a){
System.out.printIn("B<A");
}

else{
System.out.printIn("B=A");
}
}
}
