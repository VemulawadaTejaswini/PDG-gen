import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count,i;
		Set<Character> left=new TreeSet<Character>();
		Set<Character> right=new TreeSet<Character>();
		Set<Character> now=new TreeSet<Character>();
		
		left.add('q');left.add('w');left.add('e');
		left.add('r');left.add('t');left.add('a');
		left.add('s');left.add('d');left.add('f');
		left.add('v');left.add('b');left.add('g');
		left.add('c');left.add('x');left.add('z');
		
		right.add('y');right.add('u');right.add('i');
		right.add('h');right.add('p');right.add('o');
		right.add('j');right.add('k');right.add('l');
		right.add('n');right.add('m');
		
		while(true){
			count=0;
			char[] ch=sc.next().toCharArray();
			if(ch[0]=='#') break;
			if(left.contains(ch[0])){
				now=left;
			}
			else{
				now=right;
			}
			for(i=1;i<ch.length;i++){
				if(now.contains(ch[i])){
					continue;
				}
				else{
					count++;
					if(now.equals(left)){
						now=right;
					}
					else{
						now=left;
					}
				}
			}//for
			System.out.println(count);
		}
	}
}