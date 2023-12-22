import java.util.Scanner;

/**
 * 
 */

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		String taro = "";
		String hana = "";
		String str;
		
		int i = 0;
		int num = 0;
		int tpoi = 0;
		int	hpoi = 0;
		
		num = as.nextInt();
		
		for(i=0;i<num;i++){
			
			taro = as.next();
			hana = as.next();
			
			if(hana.compareTo(taro) == 0){
				
				tpoi++;
				hpoi++;
				
			}
			else if(hana.compareTo(taro) < 0){     //??±????????????????????????????????§????????´???
				
				tpoi = tpoi + 3;
				
			}
			else{
				
				hpoi = hpoi + 3;
				
			}
			
		}
		
		str = String.valueOf(tpoi)+" "+String.valueOf(hpoi);
		System.out.println(str);

	}

}