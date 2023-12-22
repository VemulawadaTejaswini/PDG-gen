import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int cou = 0;
    for(int i=a; i<=b; i++) {
    		if(i/10000 == i%10) {
    			if(i/1000-i/10000*10 == (i%100)/10) {
    			cou++;
    		}
    }
    }
    System.out.println(cou);
    		}
}