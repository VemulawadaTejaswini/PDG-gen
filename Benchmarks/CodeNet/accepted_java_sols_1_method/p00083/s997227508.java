import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=0,month=0,day=0;
		int nensu=0;

		while(sc.hasNext()) {
			year=sc.nextInt();
			month=sc.nextInt();
			day=sc.nextInt();

			nensu=(year-1)*372+(month-1)*31+day;

			if(nensu<1867*372+8*31+8) {
				System.out.println("pre-meiji");
			}
			else if(nensu>=1867*372+8*31+8 && nensu<=1911*372+6*31+29) {
				System.out.println("meiji "+(year-1867)+" "+month+" "+day);
			}
			else if(nensu>=1911*372+6*31+30 && nensu<1925*372+11*31+25) {
				System.out.println("taisho "+(year-1911)+" "+month+" "+day);
			}
			else if(nensu>=1925*372+11*31+25 && nensu<=1988*372+7) {
				System.out.println("showa "+(year-1925)+" "+month+" "+day);
			}
			else {
				System.out.println("heisei "+(year-1988)+" "+month+" "+day);
			}
		}
	}
}
