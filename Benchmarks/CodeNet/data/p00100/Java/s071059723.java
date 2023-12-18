import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    Man[] man = new Man[4000];
	    int n = kbd.nextInt();
	    if(n!=0) solve(n, man);
	}
    }

    static void solve(int n, Man[] man){
	int i=0, cnt=0;
	while(n>0){
	    i=0;
	    int m = kbd.nextInt();
	    int t = kbd.nextInt();
	    int c = kbd.nextInt();
	    while(i!=cnt && man[i].getM()!=m) i++;
	    if(i==cnt){
		man[i] = new Man(m, t*c);
		cnt++;
	    }
	    else{
		man[i].plus(t*c);
	    }
	    n--;
	}
	int a=0;
	for(i=0; i<cnt; i++){
	    if(man[i].getP() >= 1000000){
		System.out.println(man[i].getM());
		a++;
	    }
	}
	if(a==0){
	    System.out.println("NA");
	}
    }
}

class Man{
    int m;
    int p;
    public Man(int num, int pt){
	m = num;
	p = pt;
    }
    public void plus(int pt){
	p += pt;
    }
    public int getP(){
	return p;
    }
    public int getM(){
	return m;
    }
}