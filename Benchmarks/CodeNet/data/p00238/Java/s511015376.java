import java.util.*;

public class v02_0238_sano{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	while(true){
	    int t=scan.nextInt();
	    if(t==0){
		break;
	    }
	    int n=scan.nextInt();
	    for(int i=0;i<n;i++){
		int from=scan.nextInt();
		int to=scan.nextInt();
		t-=to-from;
	    }
	    if(t<=0){
		System.out.println("OK");
	    }else{
		System.out.println(t);
	    }
	}
    }
}