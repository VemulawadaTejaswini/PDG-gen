import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	HashMap<Integer,Integer> map=new HashMap<>();
	map.put(a,map.getOrDefault(a,0)+1);
	map.put(b,map.getOrDefault(b,0)+1);
	map.put(c,map.getOrDefault(c,0)+1);
	if(map.get(5)==2&&map.get(7)==1){
	    out.println("YES");
	}else{
	    out.println("NO");
	}
    }
}