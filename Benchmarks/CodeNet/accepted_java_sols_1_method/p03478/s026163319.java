import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
	int min = sc.nextInt();
	int max = sc.nextInt();
	int result = 0;
	for(int i = 1; i <= num; i++){
      	int j = i;
		int total = 0;
		while(j != 0){
			total = total + j %10;
			j = j/10;
		}

		if(min <= total && total <= max){
			result = result + i;
		}
	}
    	System.out.println(result);
  }
}