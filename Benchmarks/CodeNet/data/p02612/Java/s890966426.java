package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        if(n <= 1000){
            System.out.println(1000 - n);
        }else if(n <= 2000){
            System.out.println(2000 - n);
        }
        else if(n <= 3000){
            System.out.println(3000 - n);
        }
        else if(n <= 4000){
            System.out.println(4000 - n);
        }
        else if(n <= 5000){
            System.out.println(5000 - n);
        }
        else if(n <= 6000){
            System.out.println(6000 - n);
        }
        else if(n <= 7000){
            System.out.println(7000 - n);
        }
        else if(n <= 8000){
            System.out.println(8000 - n);
        }
        else if(n <= 9000){
            System.out.println(9000 - n);
        }
        else if(n <= 10000){
            System.out.println(10000 - n);
        }
        
        sc.close();
	}
}


