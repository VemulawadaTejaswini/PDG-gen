import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(sc.hasNext()){
	    int[] num = new int[10];
	    for(int i=0; i<num.length; i++){
		num[i] = sc.nextInt();
	    }

	    int[] right = new int[10];
	    int[] left = new int[10];

	    right[0] = num[0];
	    int countR = 1;
	    int countL = 0;
	    String ans = "YES";
	    for(int i=1; i<num.length; i++){
		if(right[countR-1]<num[i]){right[i] = num[i]; countR++;}
		else{
		    if(countL==0){left[countL] = num[i]; countL++;}
		    else if(left[countL-1]<num[i]){left[countL] = num[i]; countL++;}
		    else {ans = "NO"; break;}
		}
	    }

	    System.out.println(ans);
	}
    }
}