import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t;
        while(a!= 0 && b!= 0){
        	if(a > b){
        		t = b;
        		b = a;
        		a = t;
        	}
            System.out.println(a + " " + b);
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}