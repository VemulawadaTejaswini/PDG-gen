import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int hour1 = sc.nextInt() * 60 + sc.nextInt(); //Time From
    	int hour2 = sc.nextInt() * 60 + sc.nextInt(); //Time To
      	int study = sc.nextInt(); //Study Time
      
      	//起きている時間
      	int time = hour2 - hour1;
      
      	//Study Time 
      	if (time - study >= 0) {
      		System.out.println(time - study);
        }
      	else {
      		System.out.println(0);
        }
    }
}