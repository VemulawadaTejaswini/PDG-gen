import java.util.Scanner;

class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && b > c){
        System.out.println("c b a");
        }
        else if (a > c && b > c && a < b){
        System.out.println("c a b");
        }
        else if (a < b && b < c){
        System.out.println("a b c");	
        }
        else if (a < c && b > c){
        System.out.println("a c b");	
        }
        else if (a < b && b > c && a < c){
        System.out.println("b a c");	
        }
        else{
            System.out.println("b c a");	
            }
	}

}
