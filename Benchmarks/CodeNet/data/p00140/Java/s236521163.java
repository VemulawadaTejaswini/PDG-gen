import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,start,goal,i;
		boolean f;
		n=sc.nextInt();
		while(n--!=0){
			start=sc.nextInt();
			goal=sc.nextInt();
			if(6<=start){
				if(6<=goal){
					//X^[gª5Èã©ÂS[ª9ÈºBzÂàÅIíé
					
					//System.out.println("A");
					
					f=true;
					for(i=start;i<=goal;i++){
						if(f) System.out.print(i);
						else System.out.print(" "+i);
						f=false;
					}
				}
				else{
					//X^[gª5Èã©ÂS[ª0©ç4
					
					//System.out.println("B");
					
					f=true;
					for(i=start;i<=9;i++){
						if(f) System.out.print(i);
						else System.out.print(" "+i);
						f=false;
					}
					System.out.print(" 5");
					for(i=4;i>=goal;i--){
						System.out.print(" "+i);
					}
				}
			}
			else{
				//X^[gª0©ç4
				if(start<goal){
					
					//System.out.println("C");
					
					f=true;
					for(i=start;i<=goal;i++){
						if(f) System.out.print(i);
						else System.out.print(" "+i);
						f=false;
					}
				}
				else{
					
					//System.out.println("D");
					
					f=true;
					for(i=start;i>=goal;i--){
						if(f) System.out.print(i);
						else System.out.print(" "+i);
						f=false;
					}
				}
			}
		}
	}
}