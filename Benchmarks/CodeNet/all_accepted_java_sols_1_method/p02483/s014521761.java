import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] num = new int[3];
	for(int i = 0 ; i < 3 ; i++) num[i] = sc.nextInt();
	Arrays.sort(num);
	for(int i = 0 ; i < 3 ; i++){
	    if(i == 2) System.out.println(num[i]);
	    else System.out.printf("%d ", num[i]);
	}
    }
}