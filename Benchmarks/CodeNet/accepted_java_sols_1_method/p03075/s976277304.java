import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] antena = new int[5];
      for(int i=0;i<5;i++){
	antena[i]=sc.nextInt();
      }
		int k=sc.nextInt();
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
             
				if(antena[j]-antena[i]>k) {System.out.println(":("); return;}
			}
		}
System.out.println("Yay!");
	}
}
