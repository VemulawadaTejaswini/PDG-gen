import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
int[] ary = new int[3];
		ary[0] = sc.nextInt();
		ary[1] = sc.nextInt();
		ary[2] = sc.nextInt();
		
if(ary[0] > ary[1]){
int cap = ary[0];
ary[0] = ary[1];
ary[1] = cap;
}
if(ary[1] > ary[2]){
int cap = ary[1];
ary[1] = ary[2];
ary[2] = cap;
}
if(ary[0] > ary[1]){
int cap = ary[0];
ary[0] = ary[1];
ary[1] = cap;
}

int cost = 0;
cost += Math.abs(ary[1]-ary[0]);
cost += Math.abs(ary[2]-ary[1]);
System.out.println(cost);
	}
}