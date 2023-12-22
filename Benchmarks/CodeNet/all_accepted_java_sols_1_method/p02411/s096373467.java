import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int tyukan,kimatu,saisi;
		int ten;
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			
			tyukan=scan.nextInt();
			kimatu=scan.nextInt();
			saisi=scan.nextInt();
			if(tyukan==-1&&kimatu==-1&&saisi==-1)
				break;
			if(tyukan==-1||kimatu==-1){
				System.out.println("F");
			}else{
				if(tyukan+kimatu>=80) {
					System.out.println("A");
				}else {
					if(tyukan+kimatu>=65) {
						System.out.println("B");
					}else{
						if(tyukan+kimatu>=50) {
							System.out.println("C");
						}else {
							if(tyukan+kimatu>=30) {
								if(saisi>=50) {
								System.out.println("C");
								}else {
									System.out.println("D");
								}
							}else {
								System.out.println("F");
							}
						}
					}
				}
					
			}
				
		}
		
	}
}