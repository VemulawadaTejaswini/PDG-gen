import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
  		Scanner scan = new Scanner(System.in);
  		int cnt1 = 0;
  		int cnt2 = 0;
  		for(int i = 0; i < 3; i++){
    		int num = scan.nextInt();
    		if(num == 5){
      			cnt1++;
    		}
    		else if(num == 7){
      			cnt2++;
    		}
  		}
  
  		if(cnt1 == 2 && cnt2 == 1){
    		System.out.println("YES");
  		}
  		else{
    		System.out.println("NO");
  		}
  		scan.close();
	}
}
