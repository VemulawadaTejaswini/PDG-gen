import java.util.Scanner;
import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	int[] str;
	while(sc.hasNext()){
	    str = new int[10];

	    for(int i = 0; i < 10; i++)
		str[i] = sc.nextInt();

	    Arrays.sort(str);
	    for(int i = 1, l = str.length; i <= 3; i++)
		System.out.println(Integer.toString(str[l-i]));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}