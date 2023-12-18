// 数字の桁を入れ替えて出力
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	int a = kbd.nextInt();
	while(a>0){
	    String n = kbd.next();
	    int[] num = new int[8];
	    int i;
	    for(i=0; i<num.length; i++){
		num[i] = Integer.parseInt(n.substring(i, i+1));
	    }
	    sortMin(num);
	    String max = "";
	    String min = "";
	    for(i=0; i<num.length; i++){
		max += Integer.toString(num[num.length-1-i]);
		min += Integer.toString(num[i]);
	    }

	    int ans = Integer.parseInt(max) - Integer.parseInt(min);
	    System.out.println(ans);
	    a--;
	}
    }

    static void sortMin(int[] num){
	int i, j;
	for(i=0; i<num.length; i++){
	    for(j=i+1; j<num.length; j++){
		if(num[i] > num[j]){
		    int w = num[i];
		    num[i] = num[j];
		    num[j] = w;
		}
	    }
	}
    }
}
	    