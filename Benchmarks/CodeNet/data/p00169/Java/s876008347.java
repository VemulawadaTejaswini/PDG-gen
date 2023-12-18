import java.util.*;

public class Main{
	public static void main(String[] args){
		int i,x,rst,oneCount;
		boolean flg;
		Scanner scan = new Scanner(System.in);

		while(true){
			String[] s = scan.nextLine().split(" ");
			rst = oneCount = 0;
			flg = true;

			if(s[0].equals("0")) break;

			for(i=0;i<s.length;i++){
				x = Integer.parseInt(s[i]);

				if(x==1) oneCount++;

				else if(x>=10){
					if(rst+10<22) rst += 10;
					else{
						rst = 0;
						flg = false;
						break;
					}
				}

				else{
					if(rst+x<22) rst += x;
					else{
						rst = 0;
						flg = false;
						break;
					}
				}
			}

			if(flg && oneCount>=1){
				if(rst+11+(oneCount-1) < 22)
					rst += 11 + (oneCount-1);
				else if(rst+oneCount < 22)
					rst += oneCount;
				else
					rst = 0;
			}
			System.out.println(rst);
		}
	}
}