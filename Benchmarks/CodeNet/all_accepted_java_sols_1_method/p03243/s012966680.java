import java.io.*;

class Main
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String  str = br.readLine();

	String[] ar = str.split("");

	int[] num_ar = new int[3];
	for(int i=0; i<3; i++)
	    num_ar[i] = Integer.parseInt(ar[i]);

	if(num_ar[0]<num_ar[1])
	    System.out.println(100*(num_ar[0]+1)+10*(num_ar[0]+1)+num_ar[0]+1);
	else if(num_ar[0]==num_ar[1]){
	    if(num_ar[1]<num_ar[2])
		System.out.println(100*(num_ar[0]+1)+10*(num_ar[0]+1)+num_ar[0]+1);
	    else if(num_ar[1]==num_ar[2])
		System.out.println(100*(num_ar[0])+10*(num_ar[0])+num_ar[0]);
	    else
		System.out.println(100*(num_ar[0])+10*(num_ar[0])+num_ar[0]);
	}
	else
	    System.out.println(100*(num_ar[0])+10*(num_ar[0])+num_ar[0]);
	
    }
}