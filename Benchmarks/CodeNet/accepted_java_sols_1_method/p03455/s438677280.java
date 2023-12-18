import java.util.Scanner;
public class Main {
	public static void main(String args[]){
      try (Scanner sc = new Scanner(System.in)) {
        while (sc.hasNextInt()) {
               int a = sc.nextInt();
               int b = sc.nextInt();
               if (a%2==1){
               	if (b%2==1){
               		System.out.println("Odd");
               	} else {
               		System.out.println("Even");
               	}
               } else {
               	System.out.println("Even");
               }
            }
        }
    }
}