import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int d;
	int w = sc.nextInt();
	int n = sc.nextInt();
	int[] line;
	int[] a;
	line = new int[w];
	a = new int[2];
	for(int i=0;i<w;i++) line[i] = i+1;
	for(int i=0;i<n;i++){
	    String s = sc.next();
	    int l = s.length();
	    int k = 0, f=0, x=0;
	    for(int j=0;j<l;j++){
		char c = s.charAt(j);
		if('0' > c || c > '9'){
		    a[k] = Integer.parseInt(s.substring(x,j));
		     k++;
		     f=0;
		}else{
		    if(f==0){
			x=j;
			f=1;
		    } 
		}
	    }
	    a[1] = Integer.parseInt(s.substring(x,l));
	    d = line[a[0]-1];
	    line[a[0]-1] = line[a[1]-1];
	    line[a[1]-1] = d;
	}
	for(int i=0;i<w;i++) System.out.println(line[i]);
    }
}