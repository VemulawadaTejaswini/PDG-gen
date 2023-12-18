import java.util.*;

class Main{
    public static void main(String[] args)throws IOException{
	int in;
	int[] max = new int[3];
	Scanner s = new Scanner(System.in);

	for(int i=0;i<3;i++){
	    max[i]=0;
	}

	for(int i=0;i<10;i++){
	    in=s.nextInt();

	    if(max[0]<in){
		max[2]=max[1];
		max[1]=max[0];
		max[0]=in;
	    }
	    else if(max[0]==in){
		max[2]=max[1];
		max[1]=in;
	    }
	    else if(max[1]<in){
		max[2]=max[1];
		max[1]=in;
	    }
	    else if(max[1]==in){
		max[2]=max[1];
		max[1]=in;
	    }
	    else if(max[2]<in){
		max[2]=in;
	    }
	}

	for(int i=0;i<3;i++){
	    System.out.println(max[i]);
	}

    }
}