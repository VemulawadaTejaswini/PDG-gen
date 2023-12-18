import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
	Scanner sc = new Scanner(in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	String[] d=new String[k];
	for(int i=0;i<k;i++){
	    d[i]=sc.next();
	}
	int ans=n;
	int c=0;
	while(c!=k){
	    String ansstr=Integer.toString(ans);
	    for(int i=0;i<k;i++){
		if(!ansstr.contains(d[i]))c++;
	    }
	    if(c!=k){
		c=0;
		ans++;
	    }
	}
	out.println(ans);
    }
}
