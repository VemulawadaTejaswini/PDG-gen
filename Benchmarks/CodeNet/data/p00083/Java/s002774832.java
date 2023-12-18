import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int y, m, d;

    void run(){
	while(sc.hasNext()){
	    y = sc.nextInt();
	    m = sc.nextInt();
	    d = sc.nextInt();
	    solve();
	}
    }

    void solve(){
	// pre-meiji
	if(y<1868){ show("pre-meiji"); }
	// pre-meiji and meiji
	else if(y==1868){
	    if(m<9){ show("pre-meiji"); }
	    else if(m==9){
		if(d<8){ show("pre-meiji"); }
		else{ show("meiji"); }
	    }
	    else{ show("meiji"); }
	}
	// meiji
	else if(y<1912){ show("meiji"); }
	// meiji and taisho
	else if(y==1912){
	    if(m<7){ show("meiji"); }
	    else if(m==7){
		if(d<30){ show("meiji"); }
		else{ show("taisho"); }
	    }
	    else{ show("taisho"); }
	}
	// taisho
	else if(y<1926){ show("taisho"); }
	// taisho and showa
	else if(y==1926){
	    if(m<12){ show("taisho"); }
	    else if(m==12){
		if(d<25){ show("taisho"); }
		else{ show("showa"); }
	    }
	    else{ show("showa"); }
	}
	// showa
	else if(y<1989){ show("showa"); }
	// showa and heisei
	else if(y==1989){
	    if(m==1){
		if(d<8){ show("showa"); }
		else{ show("heisei"); }
	    }
	    else{ show("heisei"); }
	}
	// heisei
	else{ show("heisei"); }
    }

    void show(String mes){
	if(mes.equals("pre-meiji"))
	    show(mes, 0);
	else if(mes.equals("meiji"))
	    show(mes, y-1868+1);
	else if(mes.equals("taisho"))
	    show(mes, y-1912+1);
	else if(mes.equals("showa"))
	    show(mes, y-1926+1);
	else
	    show(mes, y-1989+1);
    }

    void show(String mes, int year){
	if(mes.equals("pre-meiji"))
	    System.out.println(mes);
	else
	    System.out.println(mes+" "+year+" "+m+" "+d);
    }
}