import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;

        while(a <= b){
        	if(a%c==0) cnt++;
        	a++;
        }    System.out.println(c);

    }
}