import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int e = kbd.nextInt();
	    if(e != 0){
		int ans = solve(e);
		System.out.println(ans);
	    }
	}
    }

    static int solve(int e){
	int ans=e, x=0, y=0, z=0;
	int s=0, r;

	for(z=(int)Math.cbrt(e); z>=0; z--){
	    s = z*z*z;
	    if(s>e) continue;
	    for(y=(int)Math.sqrt(e); y>=0; y--){
		s = y*y + z*z*z;
		if(s>e) continue;
		x=(e-s);
		s = x + y*y + z*z*z;
		//System.out.println(s);
		//if(s != e) continue;
		r = x+y+z;
		if(s==e && r<ans) ans = r;
	    }
	}
	return ans;
    }
}