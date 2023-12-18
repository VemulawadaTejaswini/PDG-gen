import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(s);
		
		for(int i=1;;i++){
			if(a.get(i-1)%2==0){
				int x = a.get(i-1)/2;
				if(a.contains(x)){
					System.out.println(i+1);
					return;
				}
				a.add(x);
			}else{
				int y = 3*a.get(i-1)+1;
				if(a.contains(y)){
					System.out.println(i+1);
					return;
				}
				a.add(y);
			}
		}
	}
}
