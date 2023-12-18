import java.util.Scanner;

public class Main {
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int a , b , sum , valLen;

	while(s.hasNext()){
		String line = s.nextLine();
		String[] array = line.split(" ",0);
		a = Integer.parseInt(array[0]);
		b = Integer.parseInt(array[1]);
		sum = a + b;
		valLen = String.valueOf( sum ).length();
		System.out.println(valLen);
	}
  }
}