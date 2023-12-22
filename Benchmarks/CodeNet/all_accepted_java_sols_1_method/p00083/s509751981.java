import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int y=sc.nextInt();
			int m=sc.nextInt();
			int d=sc.nextInt();
			int n=y*10000+m*100+d;
			if(n<=18680907){
				System.out.println("pre-meiji");
			}else if(n>=18680908&&n<=19120729){
				System.out.println("meiji "+(y-1867)+" "+m+" "+d);
			}else if(n>=19120730&&n<=19261224){
				System.out.println("taisho "+(y-1911)+" "+m+" "+d);
			}else if(n>=19261225&&n<=19890107){
				System.out.println("showa "+(y-1925)+" "+m+" "+d);
			}else{
				System.out.println("heisei "+(y-1988)+" "+m+" "+d);
			}
		}
	}
}