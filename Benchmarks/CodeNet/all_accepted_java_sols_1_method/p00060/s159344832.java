import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	int c1 = scan.nextInt();
        	int c2 = scan.nextInt();
        	int c3 = scan.nextInt();
        	int count = 0;
        	for(int i = 1;i < 11;i++){
        		if(c1 == i || c2 == i || c3 == i){
        			continue;
        		}
        		if(c1+c2+i <= 20){
        			count++;
        		}
        	}
        	System.out.println(((double)count/7.0 >= 0.5)?"YES":"NO");
        }
    }
}