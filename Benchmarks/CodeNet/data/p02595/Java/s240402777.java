import java.util.*;
public class Main {
  public static void main(String[] args){
    
	Scanner sc = new Scanner(System.in);
	
	float iLine = sc.nextInt();
	float iBase = sc.nextInt();
	iBase = iBase * iBase;

	float iValue1 = 0;
	float iValue2 = 0;
	float iTotal = 0;
	float iLoop = 0;
	int iCount = 0;

	for( iLoop = 0; iLoop < iLine; iLoop++ ){
		iValue1 = sc.nextInt();
		iValue2 = sc.nextInt();

		iValue1 = iValue1 * iValue1;
		iValue2 = iValue2 * iValue2;
		iTotal = iValue1 + iValue2;

		if(iBase > iTotal){
			iCount++;
		}
	}
    System.out.println(iCount);
  }
}