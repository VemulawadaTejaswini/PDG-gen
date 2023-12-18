import java.io.*
class Main{
    public static void main(String args[]){
        BufferedReader buf = new BufferedReader (new InputStreamReader (System.in));
	String a = buf.readLine();
	int x = Integer.parseInt(a);
	x = x*x*x;
	System.out.println(x);
    }
}