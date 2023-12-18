import java.io.*;

class Main{

public static void main(String[] args){
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int x = Integer.parseInt(br);

x = x*x*x;

System.out.println(x);

}
}