import java.util.*;

class Main{
    public static void main(String[] args){

	Scanner s = new Scanner(System.in);
	int[] prime = new int[78632];
	int j=0,num;

	for(int i=1;i<1000000;i++){
	    if( judgeprime(i) ){
		prime[j]=i;
		j++;
	    }
	}

	while( s.hasNextInt() ){
	    int much=0;
	    num=s.nextInt();
	    for(int i=0;i<78632;i++){
		much=i;
		if( prime[i]>num ){
		    break;
		}
	    }
	    if(num>999983){much++;}
	    System.out.println(much);
	}

    }
    public static boolean judgeprime(int num){
	boolean primeflag=true;

	if(num%2==0){primeflag=false;}
	else if(true){
	    for(int i=3;i<Math.sqrt(num)+1;i+=2){
		if(num%i==0){
		    primeflag=false;
		    break;
		}
	    }
	}

	if(num==0||num==1){primeflag=false;}
	else if(num==2){primeflag=true;}

	return primeflag;
    }
}