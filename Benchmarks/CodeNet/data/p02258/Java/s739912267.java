import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		//????§??????°
		int num;
		
		//?????§???
		int max;
		
		//?¨??????¨?????°
		int maxValue = -2000000000;
		int minValue;
		
		
		num=Integer.parseInt(bf.readLine());
		int tmp[]=new int[num];
		
		for(int i=0;i<num;i++){
			tmp[i]=Integer.parseInt(bf.readLine());
		}
		
		minValue=tmp[0];
		for(int i=1;i<num;i++){
			maxValue= maxValue > tmp[i]-minValue ? maxValue:tmp[i]-minValue;
			minValue = tmp[i] > minValue ? minValue:tmp[i];
		}
		
		System.out.println(maxValue);
	}

}