import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while((str=input.readLine())!=null)
	    {
		String str_ary[]=str.split(" ");
		int x[]=new int[3];
		for(int i=0;i<3;i++)
		    {
			x[i]=Integer.parseInt(str_ary[i]);
		    }
		if(
		   x[0]<1868
		   ||x[0]==1868 && x[1]<9
		   ||x[0]==1868 && x[1]==9 && x[2]<8)System.out.println("pre-meiji");
		if(
		   1869<=x[0] && x[0]<=1911
		   ||x[0]==1868 && 9<x[1]
		   ||x[0]==1868 && x[1]==9 && 8<=x[2]
		   ||x[0]==1912 && x[1]<7
		   ||x[0]==1912 && x[1]==7 && x[2]<30)System.out.println("meiji"+" "+(x[0]-1868+1)+" "+x[1]+" "+x[2]);
		if(
		   1913<=x[0] && x[0]<=1925
		   ||x[0]==1912 && 7<x[1]
		   ||x[0]==1912 && x[1]==7 && 30<=x[2]
		   ||x[0]==1926 && x[1]<12
		   ||x[0]==1926 && x[1]==12 && x[2]<25)System.out.println("taisho"+" "+(x[0]-1912+1)+" "+x[1]+" "+x[2]);
		if(
		   1927<=x[0] && x[0]<=1988
		   ||x[0]==1926 && 12==x[1] && 25<=x[2]
		   
		   ||x[0]==1989 && x[1]==1 && x[2]<8
		   )System.out.println("showa"+" "+(x[0]-1926+1)+" "+x[1]+" "+x[2]);
		if(
		   1990<=x[0]
		   ||x[0]==1989 && 1==x[1] && 8<=x[2]
		   
		   
		   )System.out.println("heisei"+" "+(x[0]-1989+1)+" "+x[1]+" "+x[2]);
	    }
    }
}