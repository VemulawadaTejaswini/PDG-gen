import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		ArrayList<StringBuilder> l=new ArrayList<>();

		int h=s.nextInt(),w=s.nextInt();

		for(int i=0;i<h;++i){
			String v=s.next();
			if(v.contains("#"))
				l.add(new StringBuilder(v));
		}
		for(int i=w-1;i>=0;--i){
			int I=i;
			if(l.stream().allMatch(o->o.charAt(I)=='.'))
				l.stream().forEach(o->o.deleteCharAt(I));
		}
		l.stream().forEach(System.out::println);
	}
}
