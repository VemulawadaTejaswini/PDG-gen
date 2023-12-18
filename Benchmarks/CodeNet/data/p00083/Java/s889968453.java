import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(stdIn.hasNext()){
			int year = stdIn.nextInt();
			int month = stdIn.nextInt();
			int day = stdIn.nextInt();

			if(year<=1867){
				System.out.println("pre-meiji");
			}
			else if(1869<=year&&year<=1911){
				System.out.println("meiji "+(year-1867)+" "+month+" "+day);
			}
			else if(1913<=year&&year<=1925){
				System.out.println("taisho "+(year-1911)+" "+month+" "+day);
			}
			else if(1927<=year&&year<=1988){
				System.out.println("showa "+(year-1925)+" "+month+" "+day);
			}
			else if(1990<=year){
				System.out.println("heisei "+(year-1988)+" "+month+" "+day);
			}

			else if(year==1868){
				if(month>9){
					System.out.println("meiji 1 "+month+" "+day);
				}
				else if(month==9){
					if(day>=8){
						System.out.println("meiji 1 "+month+" "+day);
					}
					else{
						System.out.println("pre-meiji");
					}
				}
				else{
					System.out.println("pre-meiji");
				}
			}
			else if(year==1912){
				if(month>7){
					System.out.println("taisho 1 "+month+" "+day);
				}
				else if(month==7){
					if(day>=30){
						System.out.println("taisho 1 "+month+" "+day);
					}
					else{
						System.out.println("meiji "+(year-1867)+" "+month+" "+day);
					}
				}
				else{
					System.out.println("meiji "+(year-1867)+" "+month+" "+day);
				}
			}
			else if(year==1926){
				if(month>12){
					System.out.println("showa 1 "+month+" "+day);
				}
				else if(month==12){
					if(day>=25){
						System.out.println("showa 1 "+month+" "+day);
					}
					else{
						System.out.println("taisho "+(year-1911)+" "+month+" "+day);
					}
				}
				else{
					System.out.println("taisho "+(year-1911)+" "+month+" "+day);
				}
			}
			else if(year==1989){
				if(month>1){
					System.out.println("heisei 1 "+month+" "+day);
				}
				else if(month==1){
					if(day>=8){
						System.out.println("heisei 1 "+month+" "+day);
					}
					else{
						System.out.println("showa "+(year-1925)+" "+month+" "+day);
					}
				}
				else{
					System.out.println("showa "+(year-1925)+" "+month+" "+day);
				}
			}
		}
	}
}
			