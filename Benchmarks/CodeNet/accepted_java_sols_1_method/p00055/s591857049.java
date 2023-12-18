import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double input = in.nextDouble();
			double sum=input,memo=input;
			for(int s=2;s<=10;s++){
				double m = s%2==0? memo*2:memo/3;
				memo=m;
				sum+=m;
			}
			System.out.println(sum);
		}
	}
}