import java.util.*;
public class Main{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	
	long kouyaku = 0;;
	long koubai = 0;;

		long a =sc.nextInt();
		long b =sc.nextInt();
		for(int count=2;count<=a || count<=b;count++){
			if(a%count==0 && b%count==0){
				kouyaku = count;
			}
		}
			koubai = ( a * b) / kouyaku;
			System.out.println(kouyaku+" "+koubai);
		}
			
		
	}