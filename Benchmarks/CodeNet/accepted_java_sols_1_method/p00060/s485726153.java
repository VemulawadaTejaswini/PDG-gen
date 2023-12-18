import java.util.*;

public class Main {
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	while(s.hasNext()){
	    int[] l = {1,2,3,4,5,6,7,8,9,10};
	    int[] a = new int[3];
	    for(int i=0 ; i<3 ; i++)
		a[i] = s.nextInt();
	    for(int i=0 ; i<10 ; i++){
		if(a[0]==l[i] || a[1]==l[i] || a[2]==l[i])
		    l[i] = 100;
	    }
	    int b = 0;
	    for(int i=0 ; i<10 ; i++){
		if(l[i]<=20-a[0]-a[1])
		    b++;
	    }
	    if(b>3)
		System.out.println("YES");
	    else
		System.out.println("NO");
	}
    }
}