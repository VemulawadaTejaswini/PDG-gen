import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    int s=sc.nextInt();
		s+=10000;
		int k=s%100; //下２桁
		int t=s/100; //上２桁

		if((k>12 || k==0) && t<=112 && t!=100){
			System.out.println("MMYY");
		}else if(k<=12 && k!=0 && (t>112 || t==100)){
			System.out.println("YYMM");
		}else if(k<=12 && t<=112 && k!=0 && t!=100){
			System.out.println("AMBIGUOUS");
		}else{
			System.out.println("NA");
		}



	}
}
