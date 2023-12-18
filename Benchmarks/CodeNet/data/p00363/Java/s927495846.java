import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
		String str=reader.readLine();
		String s[]=str.split(" ");
		int w=Integer.parseInt(s[0]);
		int h=Integer.parseInt(s[1]);
		String c=s[2];

		int x=(w/2);
		int y=(h/2);

		StringBuilder sb=new StringBuilder();

		for(int i=0;i<h;i++){
		    for(int j=0;j<w;j++){
			if(i==0||i==h-1){
			    if(j==0||j==w-1){
				sb.append("+");
			    }else {
				sb.append("-");
			    }
			}else{
			    if(j==0||j==w-1){
				sb.append("|");
			    }else if(i==y&&j==x){
				sb.append(c);
			    }else{
				sb.append(".");
			    }
			}
			if(j==w-1&&i!=h-1){
			    sb.append("\n");
			}
		    }
		}
		System.out.println(sb);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int gcd (int a, int b){
	return b>0?gcd(b,a%b):a;
    }
    static int lcm (int a, int b) {
	return a*b/gcd(a,b);
    }
}

