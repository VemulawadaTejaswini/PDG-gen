import java.util.Scanner;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    System.out.println(Integer.toString((sc.nextInt()+sc.nextInt())));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}