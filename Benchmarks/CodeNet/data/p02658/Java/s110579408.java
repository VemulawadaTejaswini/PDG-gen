import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main{
public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i;
	List<Long> list = new ArrayList<Long>();
	long ans;
	ans = 1;

	for(i = 0; i<n; i++){
		list.add( sc.nextLong() );
	}

	for(i = 0; i<n; i++){
			ans *= list.get(i);
	}

	if( ans >= Math.pow(10, 18) ){
      System.out.println("-1");
    }
  else{
    System.out.println(ans);
  }
}
}