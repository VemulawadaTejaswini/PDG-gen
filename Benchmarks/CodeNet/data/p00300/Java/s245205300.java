import java.util.Scanner;

public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
        	int r = sc.nextInt();
            int t = sc.nextInt();
            int a = (t / 30) * 5 + (r / 100);
            if(r % 100 == 0){
            	if(t % 30 == 0){
                    System.out.println(a);
                }else{
                	System.out.println(a + " " + (a + 5));
                }
            }else if(t % 30 == 0){
                System.out.println(a + " " + (a + 1));
            }else{
                System.out.println(a + " " + (a + 1) + " " + (a + 5) + " " + (a + 6));
            }
        }
    }
}
