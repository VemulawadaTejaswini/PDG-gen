import java.io.*;
class Main{

    public static void main(String[] args)throws IOException{
	
	BufferedReader br =
	    new BufferedReader (new InputStreamReader(System.in));
	String buf;
	int time;
	buf=br.readLine();
	time=Integer.parseInt(buf);
	for(int i=0;i<time;i++){
	    int[] side =new int[3];
	    buf=br.readLine();
	    String[] buf2=buf.split(" ");
	    for(int j=0;j<3;j++){
		side[j]=Integer.parseInt(buf2[j]);
	    }
	    java.util.Arrays.sort(side);
	    if((side[2]*side[2]-side[1]*side[1]-side[0]*side[0])==0){
		System.out.println("YES");
	    }else{
		System.out.println("NO");
	    }
	}
    }
}