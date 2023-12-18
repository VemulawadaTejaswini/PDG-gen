import java.util.*;
class Main{
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int n = sc.nextInt();
	while(a > 0 || n > 0){
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    while(!list.contains(a)){
		list.add(a);
		int max = number(maxsort(split(a,n)));
		int min = number(minsort(split(a,n)));
		a = max - min;
	    }
	    System.out.println(list.indexOf(a)+" "+a+" "+(list.size()-list.indexOf(a)));
	    a = sc.nextInt();
	    n = sc.nextInt();
	}
    }
    static int[] split(int number, int n){
	int []a = new int[n];
	for(int i = 0 ;i < n; i++){
	    a[i] = number % 10;
	    number = number / 10;
	}
	return a;
    }
    static int[] minsort(int []a){
	int max = 0;
	for(int i = 0 ;i < a.length; i++){
	    for(int j = i ; j < a.length ; j++ ){
		if(a[i] < a[j]){
		    int tmp = a[i];
		    a[i] = a[j];
		    a[j] = tmp;
		}
	    }
	}
	return a;
    }
    static int[] maxsort(int []a){
	int[] b = minsort(a);
	for(int i = 0;i<b.length/2;i++){
	    int tmp = b[i];
	    b[i] = b[b.length-1-i];
	    b[b.length-1-i] = tmp;
	}
	return b;
    }
    static int number(int []a){
	int sum = 0;
	for(int i = 0;i < a.length ;i++){
	    sum = sum * 10 + a[a.length -i -1];
	}
	return sum;
    }
}