import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
 
    int all = 0;
    if(b>=100){
    	all = a*1000+b;
    }else if (b>=10) {
		all = a*100+b;
    }else {
		all = a*10+b;
	}
    int cou = 0;
    for(int i=0; i<=all; i++) {
    	if(all == i*i) {
    	    cou++;
}
}
        if(cou>0){
    		System.out.println("Yes");
    	}else{
    		System.out.println("No");
      }
}
}
