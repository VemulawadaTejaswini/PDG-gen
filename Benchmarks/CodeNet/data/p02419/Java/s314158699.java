import java.util.Scanner;

public class Aim {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String w, t;
        w = sc.next();
        do{
        	t = sc.next();
        	if(t.contains(w)) count++;
        }while(!t.contains("END_OF_TEXT")) ;
        System.out.println(count);
        sc.close();
    }
}
