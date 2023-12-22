import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int a = Integer.parseInt(scanner.next());
		if(a<=3){
			System.out.println("1");
			return;
		}
		
		int maxBeki=0;
		int i =0;
		int j =0;
		for(i=2;;i++){
			int maxBekiLine=0;
			int tmpBekiLine=i;			
			for(j=2;;j++){
				tmpBekiLine =tmpBekiLine*i; 
				if(tmpBekiLine>a){
					break;
				}
				maxBekiLine=tmpBekiLine;
			}			
			
			if(maxBekiLine>maxBeki){
				maxBeki = maxBekiLine;
			}
			if(j==2){
				break;
			}
		}
		System.out.println(maxBeki);		
	}
}
