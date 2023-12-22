import java.util.*;

public class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int y = sc.nextInt()/1000;
	
	boolean flag = false;
	
	for(int i = 0;i<=n;i++){//10000
	    if(flag == true)break;
	    
	    for(int j = 0;j<=n;j++){//5000
	       
		if((10*i)+(5*j)+(n-i-j) == y && (n-i-j)>=0){
		    System.out.println(i+" "+j+" "+(n-i-j));
		    flag = true;
		}
	    }
	}
	if(flag == false){
	    System.out.println("-1 -1 -1");
	}
    }
}
