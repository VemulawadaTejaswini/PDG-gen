import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int[] a = new int[4];
	    int[] b = new int[4];
	    for(int i=0; i<a.length; i++){
		a[i] = sc.nextInt();
	    }
	    for(int i=0; i<b.length; i++){
		b[i] = sc.nextInt();
	    }
	    int hit = 0;
	    int blow = 0;
	    for(int i=0; i<a.length; i++){
		if(a[i]==b[i]){hit++; b[i] = -1;}
	    }

	    for(int i=0; i<a.length; i++){
		for(int j=0; j<b.length; j++){
		    if(a[i]==b[j]){blow++;}
		}
	    }

	    System.out.println(hit+" "+blow);
	}
    }
}