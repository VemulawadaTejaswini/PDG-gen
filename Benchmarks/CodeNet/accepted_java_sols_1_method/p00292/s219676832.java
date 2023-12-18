import  java.util.*;
class Main{
    int N;
    int K;
    int P;
    Main(){
	Scanner sc=new Scanner(System.in);
	N=sc.nextInt();
	for(int i=0; i<N; i++){
	    K=sc.nextInt();
	    P=sc.nextInt();
	    
	    if(K%P==0){
		System.out.println(P);
	    }else{
		System.out.println(K%P);
	    }
	}
    }

    public static void main(String[] args){
	new Main();
    }
}