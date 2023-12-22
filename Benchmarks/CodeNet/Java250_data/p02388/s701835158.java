import java.io.*;
class Main {
    public static void main(String argv[]) {
        try{
	int x;
        BufferedReader d =new BufferedReader(new InputStreamReader(System.in));
	x= Integer.parseInt(d.readLine());
        System.out.println(x=x*x*x);
	}catch(IOException e){}
    }
}