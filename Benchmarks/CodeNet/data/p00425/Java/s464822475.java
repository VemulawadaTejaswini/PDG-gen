import java.util.*;

class Main{

    public static void main(String[] args){

	Scanner in = new Scanner(System.in);
	int[] dice = {6,2,1,5,3,4};
	int sum,n,h;
	String s;

	n = in.nextInt();
	sum=1;
	for(int i=0;i<n;i++){
	    s = in.next();
	    if(s.equals("North")){
		h=dice[0];
		dice[0]=dice[3];
		dice[3]=dice[2];
		dice[2]=dice[1];
		dice[1]=h;
		sum+=dice[2];
	    }else if(s.equals("East")){
		h=dice[2];
		dice[2]=dice[5];
		dice[5]=dice[0];
		dice[0]=dice[4];
		dice[4]=h;
		sum+=dice[2];
	    }else if(s.equals("West")){
		h=dice[2];
		dice[2]=dice[4];
		dice[4]=dice[0];
		dice[0]=dice[5];
		dice[5]=h;
		sum+=dice[2];
	    }else if(s.equals("South")){
		h=dice[2];
		dice[2]=dice[3];
		dice[3]=dice[0];
		dice[0]=dice[1];
		dice[1]=h;
		sum+=dice[2];
	    }else if(s.equals("Right")){
		h=dice[1];
		dice[1]=dice[4];
		dice[4]=dice[3];
		dice[3]=dice[5];
		dice[5]=h;
		sum+=dice[2];
	    }else if(s.equals("Left")){
		h=dice[1];
		dice[1]=dice[5];
		dice[5]=dice[3];
		dice[3]=dice[4];
		dice[4]=h;
		sum+=dice[2];
	    }


	}


	System.out.println(sum);
	sum=1;








    }




}