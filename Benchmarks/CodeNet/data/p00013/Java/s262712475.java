import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        ArrayList<Integer>  ar    = new ArrayList<Integer>();

        int i;
        while(sc.hasNext()){
        	i = sc.nextInt();
        	if  (i == 0){ar.add(stack.pop());  }
        	else        {stack.push(i);}
        }

        //output
        for(int j:ar){System.out.println(j);}
    }
}