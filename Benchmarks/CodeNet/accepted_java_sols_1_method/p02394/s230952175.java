import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
	int W,H,x,y,r;
	String s = buf.readLine();
	String[] strlAry =s.split(" ");
	for(int i=0;i<strlAry.length;i++){
	}
	W= Integer.parseInt(strlAry[0]);
	H= Integer.parseInt(strlAry[1]);
	x= Integer.parseInt(strlAry[2]);
	y= Integer.parseInt(strlAry[3]);
	r= Integer.parseInt(strlAry[4]);


	if(((x+r) <=W && 0<=(x-r)) && ((y+r) <=H) &&( 0<=(y-r)) ){
			System.out.println("Yes");
	}
	else{
			System.out.println("No");
	}
}
}