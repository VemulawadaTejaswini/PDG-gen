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
	int s, r;

	for(z=0; z<=(int)Math.cbrt(e); z++){
	    s = x + y*y +z*z*z;
	    if(s>e) continue;
	    for(y=0; y<=(int)Math.sqrt(e); y++){
		s = x + y*y +z*z*z;
		if(s>e) continue;
		for(x=0; x<=e; x++){
		    s = x + y*y +z*z*z;
		    r = x+y+z;
		    if(s==e && r<ans) ans = r;
		}
	    }
	}
	return ans;
    }
}