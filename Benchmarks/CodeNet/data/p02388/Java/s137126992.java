import java.io*;

class Main
{
 publi static void main (String[]args)throws IOException
 {

    BufferedReader br=
     new BufferedReader(new InputSteamReader(System.in));

     String str=br.readLine();
     int x =Integer.pareInt(str);

     System.out.println(x*x*x);
}
}