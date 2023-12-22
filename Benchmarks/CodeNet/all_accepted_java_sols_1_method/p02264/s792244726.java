import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),q=cin.nextInt(),TIME=0;
		Queue<String> name=new ArrayDeque<>();Queue<Integer>time=new ArrayDeque<>();
		for(int i=0;i<n;i++) {
			name.add(cin.next());time.add(cin.nextInt());
		}
		
		while(name.peek()!=null) {
			String str=name.remove();int t=time.remove();
			if(t>q) {
				name.add(str);time.add(t-q);
				TIME+=q;
			}
			else{
				System.out.println(str+" "+(TIME+t));
				TIME+=t;
			}
			
		}
	}

}

