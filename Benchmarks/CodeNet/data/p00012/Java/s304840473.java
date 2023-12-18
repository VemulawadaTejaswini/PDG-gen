import java.io.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Pattern pattern = Pattern.compile("(.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)");
		Matcher matcher;
		String str;
		while((str=in.readLine())!=null){
			double[] x=new double[4],y=new double[4];
			matcher = pattern.matcher(str);
			if(!matcher.matches())break;
			for(int i=0;i<4;i++){
				x[i]=Double.parseDouble(matcher.group(2*i+1));
				y[i]=Double.parseDouble(matcher.group(2*i+2));
			}
			for(int i=0;i<3;i++){
				int a=i,b=(i+1)%3,c=(i+2)%3;
				double sa=((x[a]-x[b])*(y[c]-y[a])+(y[a]-y[b])*(x[a]-x[c]))*((x[a]-x[b])*(y[3]-y[a])+(y[a]-y[b])*(x[a]-x[3]));
				double sb=((x[c]-x[3])*(y[a]-y[c])+(y[c]-y[3])*(x[c]-x[a]))*((x[c]-x[3])*(y[b]-y[c])+(y[c]-y[3])*(x[c]-x[b]));
				if(sa<0.0 && sb<0.0){System.out.println("NO");break;}
				if(i==2)System.out.println("YES");
			}
		}
	}
}