import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> list = new TreeSet<>();
        for(int i = a; i < a + m; i++){
        	if(i <= b){
            	list.add(i);
            }
        }
        for(int i = b; i > b - m; i--){
        	if(i >= a){
            	list.add(i);
            }
        }
        for(Integer x: list){
        	System.out.println(x);
        }
	}
}