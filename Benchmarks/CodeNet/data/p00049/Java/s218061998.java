import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		int o=0;
		int ab=0;
		while(sc.hasNext()){
			String blood=sc.next().split(",")[1];
			if(blood.equals("A")){
				a++;
			}
			if(blood.equals("B")){
				b++;
			}
			if(blood.equals("O")){
				o++;
			}
			if(blood.equals("AB")){
				ab++;
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
	}
}