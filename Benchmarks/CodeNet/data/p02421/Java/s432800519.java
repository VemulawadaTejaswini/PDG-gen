import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n;
		int pT=0,pH=0;
		String CardT,CardH;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			CardT=scan.next();
			CardH=scan.next();
			if(CardT.equals(CardH)){
				pT++;pH++;
			}
			else{
				Boolean Done = false;
				char[] cT=CardT.toCharArray();
				char[] cH=CardH.toCharArray();
				for(int j=0;j<cT.length&&j<cH.length;j++){
					if(cT[j]==cH[j]){
						continue;
					}
					else if(cT[j]>cH[j]){
						pT+=3;
						Done = true;
						break;
					}
					else{
						pH+=3;
						Done = true;
						break;
					}
				}
				if(Done==false){
					if(cT.length>cH.length){
						pT+=3;
					}
					else{
						pH+=3;
					}
				}
			}
		}
		scan.close();
		System.out.println(pT + " " + pH);
	}
}
