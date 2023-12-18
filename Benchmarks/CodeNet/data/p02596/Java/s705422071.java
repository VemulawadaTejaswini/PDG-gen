import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		boolean flag = sosuu(k);
		if(!flag){System.out.println("-1");}
		else{
			k=isPerfectNumber(k-1)+1;
			System.out.println(""+(k-1));
		}
	}
	public static boolean sosuu(int target){

	    if (target < 2) {
	      return false;
	    }
	    if (target % 2 == 0) {
	      return false;
	    }

	    for (int i = 3; i <= Math.sqrt(target); i+=2) {
	      if (target % i == 0) {
	        return false;
	      }
	    }
return true;
	  }
	static int isPerfectNumber(int num) {
        int sum = 0;
        for(int i = 3; i <= num / 2; i++) {
            if(num % i == 0) {
                return i;
            }
        }
        return num;
	}
}