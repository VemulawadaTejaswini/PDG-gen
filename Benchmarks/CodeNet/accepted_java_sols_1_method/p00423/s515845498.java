import java.io.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int je, x, y, z;
	    int[] ini = new int[100];
	    z=0;
	    while(true){
		je=Integer.valueOf(br.readLine());
		if(je==0)
		    break;
		for(int i=0; i<je; i++){
		    String s = br.readLine();
		    x=Integer.parseInt(s.substring(0,s.indexOf(" ")));
		    y=Integer.parseInt(s.substring(s.indexOf(" ")+1,s.length()));
		    if(x>y)
			ini[z]+=(x+y);
		    else if(x==y){
			ini[z]+=x; ini[z+1]+=y;
		    }
		    else
			ini[z+1]+=(x+y);
		}
		z+=2;
	    }
	    for(x=0; x<z; x=x+2)
		System.out.println(ini[x]+ " "+ ini[x+1]);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}