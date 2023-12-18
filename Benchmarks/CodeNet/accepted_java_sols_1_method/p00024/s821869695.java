import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double n;int i;
		while(sc.hasNext()){
			n=sc.nextDouble();
			for(i=1;;i++){	//t=√(y/4.9);y=5*i-5 -> v=9.8*√((5*i-5)/4.9)
				if(9.8*Math.sqrt((5*i-5)/4.9)>n){	//v>nで終了
					break;
				}
			}
			System.out.println(i);
		}
		sc.close();
	}
}