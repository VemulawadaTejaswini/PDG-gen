import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        int i;
        double avr=0, ans=0;
        int[] num;
        
		while(true){

        int n = sc.nextInt();
        num=new int[n];
        
		if(n==0){
			System.exit(0);
		}

    	for(i=0;i<num.length;i++){
        num[i] = sc.nextInt();
        avr+=num[i];
    	}
    	avr = avr/num.length;
        for(i=0;i<num.length;i++){
            ans=ans+(num[i]-avr)*(num[i]-avr);
        }
        System.out.printf("%4f\n",Math.sqrt(ans/num.length));
		}
	}
}