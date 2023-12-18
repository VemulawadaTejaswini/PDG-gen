import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main{
public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i;
	List<Integer> list = new ArrayList<Integer>();
  	for(i = 0; i< n; i++){
      	list.add( sc.nextInt() );	
	}
  
	long ans;
	ans = 1;
  
  	long bod;
  	bod = (long)Math.pow(10,18);
  
	for(i = 0; i<list.size(); i++){
			ans *= list.get(i);
	}
	if( (0 <=ans) && (ans <= bod) ){
      System.out.println(ans);
    }
  else{
    System.out.println("-1");
  }
}
}