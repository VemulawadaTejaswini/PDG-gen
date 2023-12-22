import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int line = sc.nextInt();
    	int line2 = sc.nextInt();
      
    	if(line == 1 && line2 == 2){
      		System.out.print(3);
    	}else if(line == 1 && line2 == 3){
      		System.out.print(2);
    	}else if(line == 2 && line2 == 1){
      		System.out.print(3);
    	}else if(line == 2 && line2 == 3){
      		System.out.print(1);
    	}else if(line == 3 && line2 == 1){
      		System.out.print(2);
    	}else if(line == 3 && line2 == 2){
      		System.out.print(1);
    	}
    }
}