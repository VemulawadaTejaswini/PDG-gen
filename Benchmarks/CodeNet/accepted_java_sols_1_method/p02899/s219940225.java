import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] list = new int[n];
		for(int i = 0; i < n; i++){
        	list[sc.nextInt()-1] = i+1;
        }
      	for(int i = 0; i < n; i++)
          System.out.print(list[i] + " ");
      	
    }
}