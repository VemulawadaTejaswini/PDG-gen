import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,q,tail,head,hz,notime=0;
		String hzn;
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	q=sc.nextInt();
	tail=n;
	//System.out.println(tail);
	head=0;
    String name[]=new String[n+1];
    int time[]=new int[n+1];
    for(i=0;i<n;i++){
    	name[i]=sc.next();
    	time[i]=sc.nextInt();
    }
    while(true){
    	if(tail==head)break;
    	
    	if(q<=time[head]){
    	hz=time[head]-q;
    	notime+=q;
    	}else{
        hz=0;
        notime+=time[head];
    	}
    	hzn=name[head];
    	if(head+1==n+1){
    		head=0;
    	}else{
    		head++;
    	}
    	if(hz==0){
    		System.out.println(hzn+" "+notime);
    		continue;
    	}
    	time[tail]=hz;
    	name[tail]=hzn;
    	if(tail+1 ==n+1){
    		tail=0;
    	}else{
    		tail++;
    	}
    	}
    
	}
}

