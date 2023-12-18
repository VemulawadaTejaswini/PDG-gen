import java.util.Scanner;

public class Main {

	static int heisei=1988, showa=1925, taisho=1911, meiji=1867;
	static int year,month,day;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			year = cin.nextInt();
			month = cin.nextInt();
			day = cin.nextInt();
			if(year<1868){
				System.out.println("pre-meiji");
			}
			else if(year==1868){
				if(month<9){
					System.out.println("pre-meiji");
				}
				else if(month>9){
					print("meiji");
				}
				else{
					if(day<8){
						System.out.println("pre-meiji");
					}
					else{
						print("meiji");
					}
				}
			}
			else if(year<1912){
				System.out.println("meiji "+(year-meiji)+" "+month+" "+day);
			}
			else if(year==1912){
				if(month<7){
					print("meiji");
				}
				else if(month>7){
					print("taisho");
				}
				else{
					if(day<30){
						print("meiji");
					}
					else{
						print("taisho");
					}
				}
			}
			else if(year<1926){
				System.out.println("taisho "+(year-taisho)+" "+month+" "+day);
			}
			else if(year==1926){
				if(month<12){
					
					print("taisho");
				}
				else if(month>12){
					print("showa");
				}
				else{
					if(day<25){
						
						print("taisho");
					}
					else{
						print("showa");	
					}
				}
			}
			else if(year<1989){
				System.out.println("showa "+(year-showa)+" "+month+" "+day);
			}
			else if(year==1989){
				if(month<1){
					print("showa");
				}
				else if(month>1){
					print("heisei");
				}
				else{
					if(day<8){
						print("showa");	
					}
					else{
						print("sheisei");	
					}
				}
			}
			else{
				System.out.println("heisei "+(year-heisei)+" "+month+" "+day);
			}
		}
	}
	static void print(String str){
		if(str.equals("heisei")){
			year-=heisei;
		}
		else if(str.equals("showa")){
			year-=showa;
		}
		else if(str.equals("taisho")){
			year-=taisho;
		}
		else if(str.equals("meiji")){
			year-=meiji;
		}
		System.out.println(str + " " +year+" " + month+" " + day);
			
		
	}
}