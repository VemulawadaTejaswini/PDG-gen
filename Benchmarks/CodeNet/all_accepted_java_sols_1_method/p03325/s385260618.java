import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();

List<Integer> c = new ArrayList<Integer>();
int count = 0;

for(int i = 0; i<N; i++) {
	c.add(sc.nextInt());

}
	for(int i = 0; i< c.size(); i++) {
	      int x = c.get(i);
		while(x  % 2 == 0) {
			x/=2;
			count++;
		}
	}
System.out.println(count);
}
}