import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	int tapNum;
	int outletNum;
	
	if(B == 1){
		tapNum = 0;
		outletNum = 1;
	}else{
		tapNum = 1;
		outletNum = A;
	}
	
	for(;;){
		if(outletNum >= B){
			break;
		}else{
			outletNum += A-1;
			tapNum++;
		}
	}
	
    System.out.println(tapNum);
  }
}