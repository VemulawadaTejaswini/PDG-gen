import java.util.*;

public class Main{
    public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int a[]= new int[3];
	int c5=0, c7=0;
	for(int i=0; i<3; i++){
	    a[i] = sc.nextInt();
	    if(a[i]==5){
		c5++;
	    }
	    if(a[i]==7){
		c7++;
	    }
	}
	if(c5==2 && c7==1){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
    }
}