import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
		int k = reader.nextInt();
        if (k%2!=0){
			int r=(k/2)*(k+1)/2;
      	System.out.printf("%d\n",r);}
        else{
			int r=(k/2)*(k/2);
        System.out.printf("%d\n",r);
        }
    }

}