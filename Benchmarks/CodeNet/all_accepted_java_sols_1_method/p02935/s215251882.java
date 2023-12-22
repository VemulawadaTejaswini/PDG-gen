import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double value=0;
		double valueMin;
		double nextMin;
		Scanner sc=new Scanner(System.in);
		ArrayList<Double>material=new ArrayList<>();
		//具材の個数
		int N=sc.nextInt();
		
		for(int i=0;i<N;i++) {
			material.add(sc.nextDouble());
		}
		
		Collections.sort(material);
		
		for(int i=0;i<N-1;i++) {
			if(i==0) {
			valueMin=material.get(0);
			nextMin=material.get(1);
			value=(valueMin+nextMin)/2;
			material.remove(material.get(0));
			material.remove(material.get(0));
			material.add(value);
			
			}else{
				value=(value+material.get(0))/2;
				material.remove(material.get(0));
			}
		}
			
		System.out.println(value);
		
	}

}
