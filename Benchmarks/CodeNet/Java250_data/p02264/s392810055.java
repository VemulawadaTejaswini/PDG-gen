import java.util.*;
class Process{
    public String name;
    public int time;
    public String getName(){
	return this.name;
    }
    public int getTime(){
	return this.time;
    }
}
class Main{

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt(),q = sc.nextInt();
	int ttltime = 0;
	
        ArrayList<Process> p = new ArrayList<Process>();
	
	for(int i = 0;i < n;i++){
	    Process ptmp = new Process();
	    ptmp.name = sc.next();
	    ptmp.time = sc.nextInt();
	    p.add(ptmp);
	}
	
	while(p.size() > 0){
	    int T = p.get(0).getTime();
	    Process ptmp2 = new Process();
	    ptmp2.name = p.get(0).getName();
	    if(T > q){
		p.remove(0);
		ptmp2.time = T - q;
		p.add(ptmp2);
		ttltime += q;
	    }
	    else{
		ttltime += T;
		System.out.println(p.get(0).getName()+" "+ttltime);
		p.remove(0);
	    }    
	}
       
    }

}
