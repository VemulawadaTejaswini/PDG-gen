import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	long val1,val2;
        long r=1;
        long LCM;

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
        	val1 = sc.nextInt();
        	val2 = sc.nextInt();

        	r = 1;
        	long tmp1=val1,tmp2=val2;
        		if(val1<val2){
        			val1 = tmp2;
        			val2 = tmp1;
        		}

        		while(r>0){
        			r = val1 % val2;
        			val1 = val2;
        			val2 = r;
        		}
         LCM = tmp1* tmp2/val1;
        System.out.printf("%d %d", val1, LCM);
        }
    }

}