import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	
	int n = kbd.nextInt();
	int[] s = new int[n];
	int i;
	for(i=0; i<n; i++){
	    s[i] = kbd.nextInt();
	}
	sort(s);
	int cnt=0;
	int m = kbd.nextInt();
	for(i=0; i<m; i++){
	    int x = kbd.nextInt();
	    boolean a = search(s, x);
	    if(a) cnt++;
	}
	System.out.println(cnt);
    }

    public static void sort(int[] s){
	int i, min, j, w;
	for(i=0; i<s.length; i++){
	    min = i;
	    for(j=i; j<s.length; j++){
		if(s[min]>s[j]) min = j;
	    }
	    w = s[i];
	    s[i] = s[min];
	    s[min] = w;
	}
    }

    public static boolean search(int[] s, int x){
	int low = 0;
	int high = s.length-1;
	int middle = (high+low)/2;
	while(low<=high){
	    if(s[middle] == x) return true;
	    else if(s[middle] < x) low = middle+1;
	    else high = middle-1;

	    middle = (high+low)/2;
	}
	return false;
    }
}