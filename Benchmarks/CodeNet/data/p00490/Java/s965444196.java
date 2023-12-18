import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int  toppingN     = sc.nextInt();
		int  valueBase    = sc.nextInt();
		int  valueTopping = sc.nextInt();
		int  calBase      = sc.nextInt();
		int[]calTopping   = new int[toppingN];
		
		for(int i=0; i<toppingN; i++)
			calTopping[i] = sc.nextInt();
		
		int valueCurr =valueBase;
		int calCurr   =calBase;
		while(true)
		{
			int maxCalTopping   =calTopping[0];
			int maxCalToppingNo =0;
			
			//選択されていない最高価格のトッピングを選択
			for(int i=1; i<toppingN; i++)
			{
				if(calTopping[i] > maxCalTopping)
				{
					maxCalToppingNo = i;
					maxCalTopping   = calTopping[i];
				}
			}
			
			//そのトッピングによって最高のピザに近づくか
			if( (calCurr+maxCalTopping)/(valueCurr+valueTopping)
					> (calCurr/valueCurr) )
			{
				//トッピングを選択　選択したトッピングは消去
				valueCurr += valueTopping;
				calCurr   += maxCalTopping;
				calTopping[maxCalToppingNo] = 0;
			}
			else break; //最高のピザは完成している
		}
		System.out.println((int)(calCurr / valueCurr));
	}
}