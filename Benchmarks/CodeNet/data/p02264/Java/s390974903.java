import java.util.Scanner;
class Queue{
	String name="";
	int time;
	public Queue(String str,int t) {
		name=str;
		time=t;
	}
	public void Show() {
		System.out.println(name+" "+time);
	}
}

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i,j,n,q,t,count=0;
        String str="";
        n=scan.nextInt();
        q=scan.nextInt();
        Queue[] queue=new Queue[n];
        for(i=0;i<n;i++) {
        	str=scan.next();
        	t=scan.nextInt();
        	queue[i]=new Queue(str,t);
        }
        i=0;
        t=0;
        while(n>=0) {
        	if(queue[i].time>q) {
        		queue[i].time-=q;
        		t+=q;
        	}
        	else {
        		t+=queue[i].time;
            	System.out.println(queue[i].name+" "+t);
        		for(j=i;j<n-1;j++) {
        			queue[j]=queue[j+1];
        		}
        		i--;
        		n--;
        	}
        	if(count==n)break;
        	i++;
        	if(i>=n) {
        		i=0;
        	}
        }
	}
}
