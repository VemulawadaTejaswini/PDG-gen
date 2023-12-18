import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		BigInteger million = new BigInteger("1000000");
		BigInteger sum;

		while(true){
			int staffCount = stdIn.nextInt();
			if(staffCount == 0)break;
			Long[][] staffArray = new Long[staffCount][3];
			boolean naFlag = true;
			List<Long> numberList = new ArrayList<Long>();

			for(int i = 0;i < staffCount; i++){
				staffArray[i][0] = stdIn.nextLong();
				staffArray[i][1] = stdIn.nextLong();
				staffArray[i][2] = stdIn.nextLong();
				String tempSum = Long.toString(staffArray[i][1] * staffArray[i][2]);
//				System.out.println(tempSum);
				sum = new BigInteger(tempSum);
				if( sum.compareTo(million) >= 0){
					numberList.add(staffArray[i][0]);
					naFlag = false;
				}
			}
			if(naFlag){
				System.out.println("NA");
			}else{
				for(Long i:numberList){
					System.out.println(i);
				}
			}
		}
	}
}