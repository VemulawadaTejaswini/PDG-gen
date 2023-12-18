import java.util.Scanner;
class Main{
    public static void main(String[] args){
	Scanner  scan =new Scanner(System.in);
	while(scan.hasNext()){
	    int s;
	    s=scan.nextInt();
	    boolean bool=false;
	    for(int i=0;i<10;i++){
		if((s%2)==1){
		    if(bool){
			System.out.printf(" ");
		    }else{
			bool=true;
		    }
		    System.out.printf("%d",(int)Math.pow(2,i));
		}
		s/=2;
		if(s==0)break;
	    }
	    System.out.println();
	}
    }
}