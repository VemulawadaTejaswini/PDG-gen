import java.io.*;

class Main
{
	public static void main(String []args) throws IOException
	{
	System.out.println("nyuuryoku");

	BufferedReader br=
	 new BufferedReader(new InputStreamReader(System.in));

	 String str =br.readLine();
	 String str2=br.readLine();
	 	 int a=Integer.parseInt(str);
	 	 int b=Integer.parseInt(str2);
	if(a>b){
 		System.out.println("a>b");
		}
		 else if(a<b) {
	  System.out.println("a<b");
  		}
  	  else if(a==b){
  		System.out.println("a==b");
  		}
	}	
}