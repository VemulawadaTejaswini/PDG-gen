// Era Name
import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt();
	    int m = kbd.nextInt();
	    if(n!=0 && m!=0){
		solve(n, m);
	    }
	}
    }

    static void solve(int n, int m){
	Era[] era = new Era[n];
	int i=0;
	// 時代設定ここから
	while(i<n){
	    String name = kbd.next();
	    int eY = kbd.nextInt();
	    int gY = kbd.nextInt();
	    era[i] = new Era(name, eY, gY);
	    i++;
	}

	i=0;
	while(i<m){
	    int year = kbd.nextInt();
	    search(era, year);
	    i++;
	}
    }
    
    static void search(Era[] era, int year){
	int i;
	int ans=0;
	String eraname="";
	for(i=0; i<era.length; i++){
	    if(era[i].searchEra(year) > 0){
		ans = era[i].searchEra(year);
		eraname = era[i].getName();
	    }
	}
	if(ans != 0)
	    System.out.println(eraname+" "+ans);
	else 
	    System.out.println("Unknown");
    }
}

class Era{
    String name;
    int ke;
    int kg;
    public Era(String n, int e, int g){
	name = n;
	ke = e;
	kg = g;
    }

    public int searchEra(int g){
	if(kg-g >=0){
	    int ans = ke-(kg-g);
	    return ans;
	}
	else return 0;
    }

    public String getName(){
	return name;
    }
}