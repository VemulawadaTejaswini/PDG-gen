import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] x = new int[3];
	int t =sc.nextInt();
	ArrayList<String> s = new ArrayList<String>();
	for(int i=0; i<t; i++){
	    for(int j=0; j<3; j++)
		x[j]=sc.nextInt();
	    Arrays.sort(x);
	    if(x[0]*x[0]+x[1]*x[1]==x[2]*x[2])
		s.add("YES");
	    else
		s.add("NO");
	}
	for(int i=0; i<s.size(); i++)
	    System.out.println(s.get(i));
    }
}