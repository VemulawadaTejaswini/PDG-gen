import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null){
			String[] num=str.split(" ");
			
			double[] changeNum=new double[num.length];
			for(int i=0;i<changeNum.length;i++){
				changeNum[i]=Double.parseDouble(num[i]);
			}
			
			double[] AP={changeNum[6]-changeNum[0],changeNum[7]-changeNum[1]};
			double[] AC={changeNum[4]-changeNum[0],changeNum[5]-changeNum[1]};
			double[] AB={changeNum[2]-changeNum[0],changeNum[3]-changeNum[1]};
			
			double u=(AP[0]*AB[1]-AB[0]*AP[1])/(AC[0]*AB[1]-AB[0]*AC[1]);
			double v=(AP[0]*AC[1]-AC[0]*AP[1])/(AB[0]*AC[1]-AC[0]*AB[1]);
			
			if(u>0 && v>0 && u+v<1){
				System.out.println("YES");
			}
			else if(u<0 || v<0 || u+v>1){
				System.out.println("NO");
			}
		}
	}

}