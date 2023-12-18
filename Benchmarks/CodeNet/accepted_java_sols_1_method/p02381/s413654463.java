import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num;
		int sum;
		double div, m;
		String str;
		String[] array_str;

		try{

			while(true){
			num=Integer.parseInt(reader.readLine());
			if(num==0)break;
			sum=0;
			div=0;//??????????????§?????????
			str=reader.readLine();
			array_str=str.split(" ");

			for(int i=0;i<num;i++){
				sum+=Integer.parseInt(array_str[i]);
			}
			m=(double)sum/num;//??????


			for(int i=0;i<num;i++){
				div+=(Double.parseDouble(array_str[i])-m)*(Double.parseDouble(array_str[i])-m)/num;
			}System.out.printf("%.8f", Math.sqrt(div));
			System.out.println();

			}//while???????????°?????????

		}catch(IOException e){
			System.out.print(e);
		}
	}

}