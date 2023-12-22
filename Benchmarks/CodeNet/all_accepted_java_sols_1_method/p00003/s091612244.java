import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	while(n!=0){

	    int[] num = new int[3];
	    int max = 0;
	    for(int i=0; i<3; i++){
		num[i] = sc.nextInt();
		if(num[i]>max){max = num[i];}
	    }

	    //String ans = "NO";
	    int sum = 0;
	    for(int i=0; i<3; i++){
		if(num[i]!=max){
		    sum += num[i]*num[i];
		}
	    }
	    String ans = "NO";
	    if(max*max==sum){ans = "YES";}



	    //int[] num2 = new int[3];
	    //num2[0] = num[0]*num[0];
	    //num2[1] = num[1]*num[1];
	    //num2[2] = num[2]*num[2];
	    //if(num2[0]==(num[1]+num[2])){ans="YES";}
	    //if(num2[1]==(num[0]+num[2])){ans="YES";}
	    //if(num2[2]==(num[0]+num[1])){ans="YES";}

	    System.out.println(ans);
	    n--;
	}
    }
}