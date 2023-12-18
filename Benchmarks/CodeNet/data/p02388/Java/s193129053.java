import java.util.*;

public class Main{
	public static void main(String[] args){
		//new Main().printHelloWorld();
		System.out.println(new Main().ITP1_1_B(Integer.parseInt(new Scanner(System.in).next())));
	}

	public void printHelloWorld(){
		System.out.println("Hello World");
	}

	public int ITP1_1_B(int x){
		return x*x*x;
	}
}