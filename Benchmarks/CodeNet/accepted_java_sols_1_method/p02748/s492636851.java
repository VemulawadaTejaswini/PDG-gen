import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        int b = sc.nextInt();
		int m = sc.nextInt();
        int c,d,e;
        int [] ina = new int [a];
        int [] inb = new int [b];
		
        int [] inm = new int [m];
        int ans = 0;
        for(int i=0;i<a;i++){
                             ina[i] = sc.nextInt();
                            }
		for(int i=0;i<b;i++){
                             inb[i] = sc.nextInt();
                            }
        for(int i=0;i<m;i++){
                             c = sc.nextInt();
                             d = sc.nextInt();
                             e = sc.nextInt();
                             inm[i] = ina[c-1]+inb[d-1]-e;
                            }
        Arrays.sort(ina);
        Arrays.sort(inb);
        Arrays.sort(inm);
        ans = Math.min(ina[0]+inb[0],inm[0]);
		System.out.println(ans);
	}
}
