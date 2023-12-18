import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0; 
		int ab = 0;
		int o = 0;
		while(sc.hasNextInt()){
			String x = sc.next();
			String[] str = x.split(",",0);
			if(str[1].equals("A"))a++;
			if(str[1].equals("B"))b++;
			if(str[1].equals("AB"))ab++;
			if(str[1].equals("O"))o++;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(ab);
		System.out.println(o);
	}
}