import java.util.*;
import java.lang.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext()){
	    int n = sc.nextInt(), m = sc.nextInt();
	    if(n+m == 0) break;
	    if(m == 1){
		for(int i = 0; i < n; i++) m = sc.nextInt();
		System.out.println("1");
	    } else {
		St[] a = new St[m];
		for(int i = 0; i < m; i++) a[i] = new St(i+1);

		for(int i = 0; i < n; i++)
		    for(int j = 0; j < m; j++)
			a[j].num += sc.nextInt();

		Arrays.sort(a);
		a[0].print();
		for(int i = 1; i < m; i++) a[i].print2();
		System.out.println();
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}

class St implements Comparable{
    public int num, id;

    St() {}
    St(int id) {
	this.id = id;
	num = 0;
    }

    public int compareTo(Object obj){
	St st = (St)obj;

	if(this.num < st.num) return 1;
	if(this.num > st.num) return -1;
	return 0;
    }

    public void print(){
	System.out.print(Integer.toString(this.id));
    }

    public void print2(){
	System.out.print(" ");
	this.print();
    }
}