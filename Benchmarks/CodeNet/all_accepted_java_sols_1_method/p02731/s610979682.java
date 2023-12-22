    import java.io.*;
	import java.util.*;
    class Main
    {
      public static void main(String args[])throws IOException
      {
        double l,x,a;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc =new Scanner(System.in);
        l=Double.parseDouble(input.readLine());
        x=l/3;
        a=x*x*x;
        System.out.println(a);
      }
    }