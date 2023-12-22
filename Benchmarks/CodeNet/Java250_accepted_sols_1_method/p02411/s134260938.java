import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		int m,f,r;
		while (s.hasNext()) {
			m = Integer.parseInt(s.next());
			f = Integer.parseInt(s.next());
			r = Integer.parseInt(s.next());

			if(m==-1||f==-1) {
				if(m==f&&f==r)
					return;
				else
					System.out.println("F");
				continue;
			}

			if(m+f>=80)
				System.out.println("A");
			else if(m+f>=65)
				System.out.println("B");
			else if(m+f>=50)
				System.out.println("C");
			else if(m+f>=30) {
				if(r>=50)
					System.out.println("C");
				else
					System.out.println("D");
			}else
				System.out.println("F");
		}
	}
}