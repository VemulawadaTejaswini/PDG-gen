import java.io.*;
 
 class Main {
       public static void main (String[ ] args) throws IOException {
                          
                 BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
                 String str = input.readLine( );
                                                               
		 String[] ary = str.split(" ");
                 Integer a = new Integer(ary[0]);
		 Integer b = new Integer(ary[1]);
		 
		 if(a > b)
		     System.out.println("a < b");
		 else if(a < b)
		     System.out.println("a > b");
		 else
		     System.out.println("a == b");
       }
 }