import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int a[] = new int[999];
        a[0] = 1;
        for(int i=1; i<999; i++){
            a[i] = a[i-1] + i + 1;
        }
        System.out.println(a[bb-aa-1]-bb);
    }
}
