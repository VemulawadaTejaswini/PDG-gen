import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		List<Double> height=new ArrayList<>();
		while (str!=null){
			double h=Double.parseDouble(str);
			height.add(h);
			str=br.readLine();
		}
		int length=height.size();
		for(int i=0;i<length-1;i++){
			for (int j=i+1;j<length;j++){
				double temporary;
				double a=height.get(i);
				double b=height.get(j);
				if(a<b){
					temporary=a;
					a=b;
					b=temporary;
				}
			}
		}
		System.out.println(height.get(length-1)-height.get(0));
	}
}