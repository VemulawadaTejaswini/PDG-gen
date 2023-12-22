import java.util.Scanner;

class Main{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	while(true){
        String W1;
        int m = 0,h=0;
        
        String W = sc.next();
        if(W.equals("-"))
           break;
        
        m = sc.nextInt();;
        for(int i=0 ; i<m;i++){
        	h = sc.nextInt();
        	W1= "";
        	W1+=W.substring(h,(W.length()));
       		W1+=W.substring(0,h);
            W=W1;
		}
        System.out.println(W);
    }
        
    
	}
}
