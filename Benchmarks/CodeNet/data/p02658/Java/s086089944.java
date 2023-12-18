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
  	long bod;
  	bod = 1;
  	for(i=0; i<18; i++){
      bod *= 10;
    }

	for(i = 0; i<n; i++){
		list.add( sc.nextLong() );
	}

	for(i = 0; i<n; i++){
			ans *= list.get(i);
	}
	if( ans > bod ){
      System.out.println("-1");
    }
  else{
    System.out.println(ans);
  }
}
}

