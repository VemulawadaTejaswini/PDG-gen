import java.util.Scanner;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int X = sc.nextInt();
      	if(400<= X && X < 600){
        System.out.println(8);
        }elseif(600 <= X && X < 800){
        	System.out.println(7);
        }elseif(800<=X && X < 1000){
        	System.out.println(6);
        }elseif(1000<=X && X<1200){
        	System.out.println(5);
        }elseif(1200<=X && X<1400){
        	System.out.println(4);
        }elseif(1400<=X && X<1600){
        	System.out.println(3);
        }elseif(1600<=X && X<1800){
        	System.out.println(2);
        }elseif(1800<=X && X<2000){
        	System.out.println(1);
        }
    }
}