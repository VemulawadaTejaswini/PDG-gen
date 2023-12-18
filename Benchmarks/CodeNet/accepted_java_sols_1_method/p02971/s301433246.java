import java.util.*;
class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<Integer> input=new ArrayList<>();
		for(int i=0;i<n;++i){
			int t=s.nextInt();
			input.add(t);
		}
		int[] m=input.stream().mapToInt(i->i).sorted().skip(n-2).toArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;++i)
			sb.append(input.get(i)==m[1]?m[0]:m[1]).append('\n');
		System.out.println(sb);
	}
}