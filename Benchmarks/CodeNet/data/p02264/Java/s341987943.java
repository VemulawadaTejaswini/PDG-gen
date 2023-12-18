import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    
	int n = 100001 ; int total = 0 ;
	int[] time = new int[n];
	String[] name = new String[n];
	int topInt = 0 ,topString=0;  //キューの先頭
	int bottomInt = 0 ,bottomString=0;//キューの末尾 +1
	
	void enQueueInt(int m){
		time[bottomInt] = m ;
		if(bottomInt == n-1) bottomInt = 0;
		else bottomInt++ ;
	}
	void enQueueString(String m){
		name[bottomString] = m ;
		if(bottomString == n-1) bottomString = 0;
		else bottomString++ ;
	}
	
	
	int deQueueInt(){
		int x = time[topInt];
		if(topInt == n-1) topInt = 0;
		else topInt++;
		return x ;
	}
	String deQueueString(){
		String x = name[topString];
		if(topString == n-1) topString = 0;
		else topString++;
		return x ;
	}
	
	void run(){
	    int m = sc.nextInt();
	    int q = sc.nextInt();
	    
	    for(int i=0;i<m;i++){
	        enQueueString(sc.next());
	        enQueueInt(sc.nextInt());
	    }

	    int x ; String y ;
	    while(topInt != bottomInt){
	        x = deQueueInt();
	        y = deQueueString();
	        
	        if(x <= q){
	            total += x;
	            System.out.printf("%s %d\n",y,total);
	            continue;
	        }
	        
	        x -= q; enQueueInt(x); enQueueString(y); total+=q;
	    }
	}
	
    public static void main(String[] args) throws Exception {
        new Main().run();
    }
}
