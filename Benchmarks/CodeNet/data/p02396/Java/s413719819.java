import java.io.*;
class Main{
    public static void main(String args[]) throws IOException{
	int j=0,x=0;
	ArrayList<Integer> list=new ArrayList<Integer>();

	for(;;)
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    j=Integer.parseInt(str);
	    if(j==0)break;
	    list.push(j);
	}
	for(int i=0;i<list.size();i++){
	    int x=list.get(i);
            System.out.println("Case "+ (i+1) +": "+x);
	}
    }
}