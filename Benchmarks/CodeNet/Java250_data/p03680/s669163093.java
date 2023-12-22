import java.util.Scanner;




public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {
    	Scanner sc=new Scanner(System.in);

    	int N=sc.nextInt();

    	int[] A=new int[N];

    	for(int i=0;i<N;i++) {
    		A[i]=sc.nextInt()-1;
    	}

    	int now=A[0];
    	int next=0;

    	int counter=0;

    	while(true) {
    		counter++;

    		if(now==1) {
    			break;
    		}

    		next=A[now];

    		A[now]=-1;
    		
    		if(next==-1) {
    			counter=-1;
    			break;
    		}else {
    			now=next;
    		}

    	}


    	System.out.println(counter);


    }

}

