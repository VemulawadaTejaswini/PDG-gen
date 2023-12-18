import java.io.*;

class Main
{
    public static void main(String[] args)
	throws IOException
    {
	int dx[] = {0,1,0,-1};
	int dy[] = {1,0,-1,0};
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<1000;i++)
	    {
		String line = in.readLine();
		boolean ok = true;
		int p = (int)(line.charAt(0)-'A');
		for(int j=1;j<line.length();j++)
		    {
			boolean ok2 = false;
			for(int k=0;k<4;k++)
			    {
				int nx = p%3 + dx[k];
				int ny = p/3 + dy[k];
				if(!(0 <= nx && nx < 3 && 0 <= ny && ny < 3))continue;
				if((char)((nx+ny*3)+'A') == line.charAt(j))ok2 = true;
			    }
			if(!ok2)
			    {
				ok = false;
				break;
			    }
			p = (int)(line.charAt(j)-'A');
		    }	
		if(ok)System.out.println(line);
	    }
    }
    
}